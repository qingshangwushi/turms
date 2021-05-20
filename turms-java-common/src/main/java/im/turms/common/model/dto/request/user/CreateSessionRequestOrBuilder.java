/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/create_session_request.proto

package im.turms.common.model.dto.request.user;

public interface CreateSessionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.CreateSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 user_id = 1;</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>optional string password = 2;</code>
   * @return Whether the password field is set.
   */
  boolean hasPassword();
  /**
   * <code>optional string password = 2;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>optional string password = 2;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>optional .im.turms.proto.UserStatus user_status = 3;</code>
   * @return Whether the userStatus field is set.
   */
  boolean hasUserStatus();
  /**
   * <code>optional .im.turms.proto.UserStatus user_status = 3;</code>
   * @return The enum numeric value on the wire for userStatus.
   */
  int getUserStatusValue();
  /**
   * <code>optional .im.turms.proto.UserStatus user_status = 3;</code>
   * @return The userStatus.
   */
  im.turms.common.constant.UserStatus getUserStatus();

  /**
   * <code>.im.turms.proto.DeviceType device_type = 4;</code>
   * @return The enum numeric value on the wire for deviceType.
   */
  int getDeviceTypeValue();
  /**
   * <code>.im.turms.proto.DeviceType device_type = 4;</code>
   * @return The deviceType.
   */
  im.turms.common.constant.DeviceType getDeviceType();

  /**
   * <code>optional string device_details = 5;</code>
   * @return Whether the deviceDetails field is set.
   */
  boolean hasDeviceDetails();
  /**
   * <code>optional string device_details = 5;</code>
   * @return The deviceDetails.
   */
  java.lang.String getDeviceDetails();
  /**
   * <code>optional string device_details = 5;</code>
   * @return The bytes for deviceDetails.
   */
  com.google.protobuf.ByteString
      getDeviceDetailsBytes();

  /**
   * <code>optional .im.turms.proto.UserLocation location = 6;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>optional .im.turms.proto.UserLocation location = 6;</code>
   * @return The location.
   */
  im.turms.common.model.bo.user.UserLocation getLocation();
  /**
   * <code>optional .im.turms.proto.UserLocation location = 6;</code>
   */
  im.turms.common.model.bo.user.UserLocationOrBuilder getLocationOrBuilder();
}
