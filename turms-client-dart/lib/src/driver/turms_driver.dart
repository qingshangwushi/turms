import 'dart:io';

import 'package:protobuf/protobuf.dart';

import '../model/proto/notification/turms_notification.pb.dart';
import '../model/proto/request/turms_request.pb.dart';
import '../transport/tcp_metrics.dart';
import 'service/connection_service.dart';
import 'service/heartbeat_service.dart';
import 'service/protocol_message_service.dart';
import 'state_store.dart';

final _requestMessageNameToTagNumber = <String, int>{};

class TurmsDriver {
  final StateStore _stateStore = StateStore();

  late final ConnectionService _connectionService;
  late final HeartbeatService _heartbeatService;
  late final ProtocolMessageService _protocolMessageService;

  TurmsDriver(
      String? host,
      int? port,
      int? connectTimeoutMillis,
      int? requestTimeoutMillis,
      int? minRequestIntervalMillis,
      int? heartbeatIntervalMillis) {
    _connectionService =
        ConnectionService(stateStore, host, port, connectTimeoutMillis)
          ..addOnDisconnectedListener(_onConnectionDisconnected)
          ..addMessageListener(_onMessage);
    _heartbeatService = HeartbeatService(_stateStore, heartbeatIntervalMillis);
    _protocolMessageService = ProtocolMessageService(
        _stateStore, requestTimeoutMillis, minRequestIntervalMillis);
  }

  // Getters

  StateStore get stateStore => _stateStore;

  // Close

  Future<void> close() => Future.wait([
        _connectionService.close(),
        _heartbeatService.close(),
        _protocolMessageService.close()
      ]);

  // Heartbeat Service

  void startHeartbeat() => _heartbeatService.start();

  void stopHeartbeat() => _heartbeatService.stop();

  Future<void> sendHeartbeat() => _heartbeatService.send();

  bool get isHeartbeatRunning => _heartbeatService.isRunning;

  // Connection Service

  Future<void> connect(
          {String? host,
          int? port,
          int? connectTimeoutMillis,
          bool? useTls,
          SecurityContext? context}) =>
      _connectionService.connect(
          host: host,
          port: port,
          connectTimeoutMillis: connectTimeoutMillis,
          useTls: useTls,
          context: context);

  Future<void> disconnect() => _connectionService.disconnect();

  bool get isConnected => _stateStore.isConnected;

  TcpMetrics? get connectionMetrics => stateStore.tcp?.metrics;

  // Connection Listeners

  void addOnConnectedListener(OnConnectedListener listener) =>
      _connectionService.addOnConnectedListener(listener);

  void addOnDisconnectedListener(OnDisconnectedListener listener) =>
      _connectionService.addOnDisconnectedListener(listener);

  void removeOnConnectedListener(OnConnectedListener listener) =>
      _connectionService.removeOnConnectedListener(listener);

  void removeOnDisconnectedListener(OnDisconnectedListener listener) =>
      _connectionService.removeOnDisconnectedListener(listener);

  // Message Service

  Future<TurmsNotification> send(GeneratedMessage message) async {
    final name = message.info_.messageName;
    var tagNumber = _requestMessageNameToTagNumber[name];
    // don't use "putIfAbsent" because dart has a implementation of bad performance
    // on closure: https://github.com/dart-lang/sdk/issues/36983.
    if (tagNumber == null) {
      final fieldName = name.substring(0, 1).toLowerCase() + name.substring(1);
      final request = TurmsRequest.create();
      final fieldInfo = request.info_.byName[fieldName];
      if (fieldInfo == null) {
        throw ArgumentError('Could not find the request type: $name');
      }
      tagNumber = fieldInfo.tagNumber;
      _requestMessageNameToTagNumber[name] = tagNumber;
    }
    final request = TurmsRequest.create()..setField(tagNumber, message);
    final notification = await _protocolMessageService.sendRequest(request);
    if (request.hasCreateSessionRequest()) {
      _heartbeatService.start();
    }
    return notification;
  }

  void addNotificationListener(NotificationListener listener) =>
      _protocolMessageService.addNotificationListener(listener);

  void removeNotificationListener(NotificationListener listener) =>
      _protocolMessageService.removeNotificationListener(listener);

  // Intermediary functions as a mediator between services

  void _onConnectionDisconnected({Object? error, StackTrace? stackTrace}) {
    _stateStore.reset();
    _heartbeatService.onDisconnected(error: error, stackTrace: stackTrace);
    _protocolMessageService.onDisconnected(
        error: error, stackTrace: stackTrace);
  }

  void _onMessage(List<int> message) {
    if (message.isNotEmpty) {
      TurmsNotification notification;
      try {
        notification = TurmsNotification.fromBuffer(message);
      } catch (e, s) {
        print('Failed to parse TurmsNotification: $e\n$s');
        return;
      }
      if (_heartbeatService.rejectHeartbeatCompletersIfFail(notification)) {
        return;
      }
      if (notification.hasCloseStatus()) {
        _stateStore.isSessionOpen = false;
        _protocolMessageService.didReceiveNotification(notification);
        // We must close the connection after finishing handling the notification
        // to ensure notification handlers will always be triggered before connection close handlers.
        _connectionService.disconnect();
        return;
      }
      if (notification.data.hasUserSession()) {
        final session = notification.data.userSession;
        _stateStore
          ..sessionId = session.sessionId
          ..serverId = session.serverId;
      }
      _protocolMessageService.didReceiveNotification(notification);
    } else {
      _heartbeatService.resolveHeartbeatCompleters();
    }
  }
}
