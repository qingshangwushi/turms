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
// source: request/group/create_group_request.proto

package im.turms.common.model.dto.request.group;

/**
 * Protobuf type {@code im.turms.proto.CreateGroupRequest}
 */
public final class CreateGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.CreateGroupRequest)
    CreateGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateGroupRequest.newBuilder() to construct.
  private CreateGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateGroupRequest() {
    name_ = "";
    intro_ = "";
    announcement_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateGroupRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateGroupRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            intro_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            announcement_ = s;
            break;
          }
          case 32: {
            bitField0_ |= 0x00000004;
            minimumScore_ = input.readInt32();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000008;
            groupTypeId_ = input.readInt64();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000010;
            muteEndDate_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.common.model.dto.request.group.CreateGroupRequestOuterClass.internal_static_im_turms_proto_CreateGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.dto.request.group.CreateGroupRequestOuterClass.internal_static_im_turms_proto_CreateGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.dto.request.group.CreateGroupRequest.class, im.turms.common.model.dto.request.group.CreateGroupRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTRO_FIELD_NUMBER = 2;
  private volatile java.lang.Object intro_;
  /**
   * <code>optional string intro = 2;</code>
   * @return Whether the intro field is set.
   */
  @java.lang.Override
  public boolean hasIntro() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string intro = 2;</code>
   * @return The intro.
   */
  @java.lang.Override
  public java.lang.String getIntro() {
    java.lang.Object ref = intro_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      intro_ = s;
      return s;
    }
  }
  /**
   * <code>optional string intro = 2;</code>
   * @return The bytes for intro.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIntroBytes() {
    java.lang.Object ref = intro_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      intro_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANNOUNCEMENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object announcement_;
  /**
   * <code>optional string announcement = 3;</code>
   * @return Whether the announcement field is set.
   */
  @java.lang.Override
  public boolean hasAnnouncement() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string announcement = 3;</code>
   * @return The announcement.
   */
  @java.lang.Override
  public java.lang.String getAnnouncement() {
    java.lang.Object ref = announcement_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      announcement_ = s;
      return s;
    }
  }
  /**
   * <code>optional string announcement = 3;</code>
   * @return The bytes for announcement.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAnnouncementBytes() {
    java.lang.Object ref = announcement_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      announcement_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MINIMUM_SCORE_FIELD_NUMBER = 4;
  private int minimumScore_;
  /**
   * <code>optional int32 minimum_score = 4;</code>
   * @return Whether the minimumScore field is set.
   */
  @java.lang.Override
  public boolean hasMinimumScore() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 minimum_score = 4;</code>
   * @return The minimumScore.
   */
  @java.lang.Override
  public int getMinimumScore() {
    return minimumScore_;
  }

  public static final int GROUP_TYPE_ID_FIELD_NUMBER = 5;
  private long groupTypeId_;
  /**
   * <code>optional int64 group_type_id = 5;</code>
   * @return Whether the groupTypeId field is set.
   */
  @java.lang.Override
  public boolean hasGroupTypeId() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional int64 group_type_id = 5;</code>
   * @return The groupTypeId.
   */
  @java.lang.Override
  public long getGroupTypeId() {
    return groupTypeId_;
  }

  public static final int MUTE_END_DATE_FIELD_NUMBER = 6;
  private long muteEndDate_;
  /**
   * <code>optional int64 mute_end_date = 6;</code>
   * @return Whether the muteEndDate field is set.
   */
  @java.lang.Override
  public boolean hasMuteEndDate() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>optional int64 mute_end_date = 6;</code>
   * @return The muteEndDate.
   */
  @java.lang.Override
  public long getMuteEndDate() {
    return muteEndDate_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, intro_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, announcement_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(4, minimumScore_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt64(5, groupTypeId_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeInt64(6, muteEndDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, intro_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, announcement_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, minimumScore_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, groupTypeId_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, muteEndDate_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof im.turms.common.model.dto.request.group.CreateGroupRequest)) {
      return super.equals(obj);
    }
    im.turms.common.model.dto.request.group.CreateGroupRequest other = (im.turms.common.model.dto.request.group.CreateGroupRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasIntro() != other.hasIntro()) return false;
    if (hasIntro()) {
      if (!getIntro()
          .equals(other.getIntro())) return false;
    }
    if (hasAnnouncement() != other.hasAnnouncement()) return false;
    if (hasAnnouncement()) {
      if (!getAnnouncement()
          .equals(other.getAnnouncement())) return false;
    }
    if (hasMinimumScore() != other.hasMinimumScore()) return false;
    if (hasMinimumScore()) {
      if (getMinimumScore()
          != other.getMinimumScore()) return false;
    }
    if (hasGroupTypeId() != other.hasGroupTypeId()) return false;
    if (hasGroupTypeId()) {
      if (getGroupTypeId()
          != other.getGroupTypeId()) return false;
    }
    if (hasMuteEndDate() != other.hasMuteEndDate()) return false;
    if (hasMuteEndDate()) {
      if (getMuteEndDate()
          != other.getMuteEndDate()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasIntro()) {
      hash = (37 * hash) + INTRO_FIELD_NUMBER;
      hash = (53 * hash) + getIntro().hashCode();
    }
    if (hasAnnouncement()) {
      hash = (37 * hash) + ANNOUNCEMENT_FIELD_NUMBER;
      hash = (53 * hash) + getAnnouncement().hashCode();
    }
    if (hasMinimumScore()) {
      hash = (37 * hash) + MINIMUM_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMinimumScore();
    }
    if (hasGroupTypeId()) {
      hash = (37 * hash) + GROUP_TYPE_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGroupTypeId());
    }
    if (hasMuteEndDate()) {
      hash = (37 * hash) + MUTE_END_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMuteEndDate());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.dto.request.group.CreateGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.CreateGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.CreateGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.CreateGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.CreateGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.dto.request.group.CreateGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.CreateGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.CreateGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.CreateGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.CreateGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.dto.request.group.CreateGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.dto.request.group.CreateGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(im.turms.common.model.dto.request.group.CreateGroupRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code im.turms.proto.CreateGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.CreateGroupRequest)
      im.turms.common.model.dto.request.group.CreateGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.dto.request.group.CreateGroupRequestOuterClass.internal_static_im_turms_proto_CreateGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.dto.request.group.CreateGroupRequestOuterClass.internal_static_im_turms_proto_CreateGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.dto.request.group.CreateGroupRequest.class, im.turms.common.model.dto.request.group.CreateGroupRequest.Builder.class);
    }

    // Construct using im.turms.common.model.dto.request.group.CreateGroupRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      intro_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      announcement_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      minimumScore_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      groupTypeId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      muteEndDate_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.dto.request.group.CreateGroupRequestOuterClass.internal_static_im_turms_proto_CreateGroupRequest_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.CreateGroupRequest getDefaultInstanceForType() {
      return im.turms.common.model.dto.request.group.CreateGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.CreateGroupRequest build() {
      im.turms.common.model.dto.request.group.CreateGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.dto.request.group.CreateGroupRequest buildPartial() {
      im.turms.common.model.dto.request.group.CreateGroupRequest result = new im.turms.common.model.dto.request.group.CreateGroupRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.intro_ = intro_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.announcement_ = announcement_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.minimumScore_ = minimumScore_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.groupTypeId_ = groupTypeId_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.muteEndDate_ = muteEndDate_;
        to_bitField0_ |= 0x00000010;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof im.turms.common.model.dto.request.group.CreateGroupRequest) {
        return mergeFrom((im.turms.common.model.dto.request.group.CreateGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.dto.request.group.CreateGroupRequest other) {
      if (other == im.turms.common.model.dto.request.group.CreateGroupRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasIntro()) {
        bitField0_ |= 0x00000001;
        intro_ = other.intro_;
        onChanged();
      }
      if (other.hasAnnouncement()) {
        bitField0_ |= 0x00000002;
        announcement_ = other.announcement_;
        onChanged();
      }
      if (other.hasMinimumScore()) {
        setMinimumScore(other.getMinimumScore());
      }
      if (other.hasGroupTypeId()) {
        setGroupTypeId(other.getGroupTypeId());
      }
      if (other.hasMuteEndDate()) {
        setMuteEndDate(other.getMuteEndDate());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      im.turms.common.model.dto.request.group.CreateGroupRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.dto.request.group.CreateGroupRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object intro_ = "";
    /**
     * <code>optional string intro = 2;</code>
     * @return Whether the intro field is set.
     */
    public boolean hasIntro() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string intro = 2;</code>
     * @return The intro.
     */
    public java.lang.String getIntro() {
      java.lang.Object ref = intro_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        intro_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string intro = 2;</code>
     * @return The bytes for intro.
     */
    public com.google.protobuf.ByteString
        getIntroBytes() {
      java.lang.Object ref = intro_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        intro_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string intro = 2;</code>
     * @param value The intro to set.
     * @return This builder for chaining.
     */
    public Builder setIntro(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      intro_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string intro = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntro() {
      bitField0_ = (bitField0_ & ~0x00000001);
      intro_ = getDefaultInstance().getIntro();
      onChanged();
      return this;
    }
    /**
     * <code>optional string intro = 2;</code>
     * @param value The bytes for intro to set.
     * @return This builder for chaining.
     */
    public Builder setIntroBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      intro_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object announcement_ = "";
    /**
     * <code>optional string announcement = 3;</code>
     * @return Whether the announcement field is set.
     */
    public boolean hasAnnouncement() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string announcement = 3;</code>
     * @return The announcement.
     */
    public java.lang.String getAnnouncement() {
      java.lang.Object ref = announcement_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        announcement_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string announcement = 3;</code>
     * @return The bytes for announcement.
     */
    public com.google.protobuf.ByteString
        getAnnouncementBytes() {
      java.lang.Object ref = announcement_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        announcement_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string announcement = 3;</code>
     * @param value The announcement to set.
     * @return This builder for chaining.
     */
    public Builder setAnnouncement(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      announcement_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string announcement = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnnouncement() {
      bitField0_ = (bitField0_ & ~0x00000002);
      announcement_ = getDefaultInstance().getAnnouncement();
      onChanged();
      return this;
    }
    /**
     * <code>optional string announcement = 3;</code>
     * @param value The bytes for announcement to set.
     * @return This builder for chaining.
     */
    public Builder setAnnouncementBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      announcement_ = value;
      onChanged();
      return this;
    }

    private int minimumScore_ ;
    /**
     * <code>optional int32 minimum_score = 4;</code>
     * @return Whether the minimumScore field is set.
     */
    @java.lang.Override
    public boolean hasMinimumScore() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 minimum_score = 4;</code>
     * @return The minimumScore.
     */
    @java.lang.Override
    public int getMinimumScore() {
      return minimumScore_;
    }
    /**
     * <code>optional int32 minimum_score = 4;</code>
     * @param value The minimumScore to set.
     * @return This builder for chaining.
     */
    public Builder setMinimumScore(int value) {
      bitField0_ |= 0x00000004;
      minimumScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 minimum_score = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinimumScore() {
      bitField0_ = (bitField0_ & ~0x00000004);
      minimumScore_ = 0;
      onChanged();
      return this;
    }

    private long groupTypeId_ ;
    /**
     * <code>optional int64 group_type_id = 5;</code>
     * @return Whether the groupTypeId field is set.
     */
    @java.lang.Override
    public boolean hasGroupTypeId() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional int64 group_type_id = 5;</code>
     * @return The groupTypeId.
     */
    @java.lang.Override
    public long getGroupTypeId() {
      return groupTypeId_;
    }
    /**
     * <code>optional int64 group_type_id = 5;</code>
     * @param value The groupTypeId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupTypeId(long value) {
      bitField0_ |= 0x00000008;
      groupTypeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 group_type_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupTypeId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      groupTypeId_ = 0L;
      onChanged();
      return this;
    }

    private long muteEndDate_ ;
    /**
     * <code>optional int64 mute_end_date = 6;</code>
     * @return Whether the muteEndDate field is set.
     */
    @java.lang.Override
    public boolean hasMuteEndDate() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional int64 mute_end_date = 6;</code>
     * @return The muteEndDate.
     */
    @java.lang.Override
    public long getMuteEndDate() {
      return muteEndDate_;
    }
    /**
     * <code>optional int64 mute_end_date = 6;</code>
     * @param value The muteEndDate to set.
     * @return This builder for chaining.
     */
    public Builder setMuteEndDate(long value) {
      bitField0_ |= 0x00000010;
      muteEndDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 mute_end_date = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMuteEndDate() {
      bitField0_ = (bitField0_ & ~0x00000010);
      muteEndDate_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:im.turms.proto.CreateGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.CreateGroupRequest)
  private static final im.turms.common.model.dto.request.group.CreateGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.dto.request.group.CreateGroupRequest();
  }

  public static im.turms.common.model.dto.request.group.CreateGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateGroupRequest>() {
    @java.lang.Override
    public CreateGroupRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateGroupRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.dto.request.group.CreateGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

