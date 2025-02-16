// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: request/conversation/update_conversation_settings_request.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
private struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
    struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
    typealias Version = _2
}

public struct UpdateConversationSettingsRequest {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    /// Query filter
    public var userID: Int64 {
        get { return _userID ?? 0 }
        set { _userID = newValue }
    }

    /// Returns true if `userID` has been explicitly set.
    public var hasUserID: Bool { return _userID != nil }
    /// Clears the value of `userID`. Subsequent reads from it will return its default value.
    public mutating func clearUserID() { _userID = nil }

    public var groupID: Int64 {
        get { return _groupID ?? 0 }
        set { _groupID = newValue }
    }

    /// Returns true if `groupID` has been explicitly set.
    public var hasGroupID: Bool { return _groupID != nil }
    /// Clears the value of `groupID`. Subsequent reads from it will return its default value.
    public mutating func clearGroupID() { _groupID = nil }

    /// Update
    public var settings: [String: Value] = [:]

    public var customAttributes: [Value] = []

    public var unknownFields = SwiftProtobuf.UnknownStorage()

    public init() {}

    fileprivate var _userID: Int64?
    fileprivate var _groupID: Int64?
}

#if swift(>=5.5) && canImport(_Concurrency)
    extension UpdateConversationSettingsRequest: @unchecked Sendable {}
#endif // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

private let _protobuf_package = "im.turms.proto"

extension UpdateConversationSettingsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
    public static let protoMessageName: String = _protobuf_package + ".UpdateConversationSettingsRequest"
    public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
        1: .standard(proto: "user_id"),
        2: .standard(proto: "group_id"),
        3: .same(proto: "settings"),
        15: .standard(proto: "custom_attributes"),
    ]

    public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
        while let fieldNumber = try decoder.nextFieldNumber() {
            // The use of inline closures is to circumvent an issue where the compiler
            // allocates stack space for every case branch when no optimizations are
            // enabled. https://github.com/apple/swift-protobuf/issues/1034
            switch fieldNumber {
            case 1: try decoder.decodeSingularInt64Field(value: &_userID)
            case 2: try decoder.decodeSingularInt64Field(value: &_groupID)
            case 3: try decoder.decodeMapField(fieldType: SwiftProtobuf._ProtobufMessageMap<SwiftProtobuf.ProtobufString, Value>.self, value: &settings)
            case 15: try decoder.decodeRepeatedMessageField(value: &customAttributes)
            default: break
            }
        }
    }

    public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every if/case branch local when no optimizations
        // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
        // https://github.com/apple/swift-protobuf/issues/1182
        try { if let v = self._userID {
            try visitor.visitSingularInt64Field(value: v, fieldNumber: 1)
        } }()
        try { if let v = self._groupID {
            try visitor.visitSingularInt64Field(value: v, fieldNumber: 2)
        } }()
        if !settings.isEmpty {
            try visitor.visitMapField(fieldType: SwiftProtobuf._ProtobufMessageMap<SwiftProtobuf.ProtobufString, Value>.self, value: settings, fieldNumber: 3)
        }
        if !customAttributes.isEmpty {
            try visitor.visitRepeatedMessageField(value: customAttributes, fieldNumber: 15)
        }
        try unknownFields.traverse(visitor: &visitor)
    }

    public static func == (lhs: UpdateConversationSettingsRequest, rhs: UpdateConversationSettingsRequest) -> Bool {
        if lhs._userID != rhs._userID { return false }
        if lhs._groupID != rhs._groupID { return false }
        if lhs.settings != rhs.settings { return false }
        if lhs.customAttributes != rhs.customAttributes { return false }
        if lhs.unknownFields != rhs.unknownFields { return false }
        return true
    }
}
