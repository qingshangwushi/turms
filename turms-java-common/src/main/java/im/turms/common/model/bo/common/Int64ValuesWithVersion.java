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
// source: model/common/int64_values_with_version.proto

package im.turms.common.model.bo.common;

/**
 * Protobuf type {@code im.turms.proto.Int64ValuesWithVersion}
 */
public final class Int64ValuesWithVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.Int64ValuesWithVersion)
    Int64ValuesWithVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Int64ValuesWithVersion.newBuilder() to construct.
  private Int64ValuesWithVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Int64ValuesWithVersion() {
    values_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Int64ValuesWithVersion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Int64ValuesWithVersion(
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              values_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            values_.addLong(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              values_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              values_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 16: {
            bitField0_ |= 0x00000001;
            lastUpdatedDate_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        values_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.common.model.bo.common.Int64ValuesWithVersionOuterClass.internal_static_im_turms_proto_Int64ValuesWithVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.bo.common.Int64ValuesWithVersionOuterClass.internal_static_im_turms_proto_Int64ValuesWithVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.bo.common.Int64ValuesWithVersion.class, im.turms.common.model.bo.common.Int64ValuesWithVersion.Builder.class);
  }

  private int bitField0_;
  public static final int VALUES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList values_;
  /**
   * <code>repeated int64 values = 1;</code>
   * @return A list containing the values.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getValuesList() {
    return values_;
  }
  /**
   * <code>repeated int64 values = 1;</code>
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <code>repeated int64 values = 1;</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public long getValues(int index) {
    return values_.getLong(index);
  }
  private int valuesMemoizedSerializedSize = -1;

  public static final int LAST_UPDATED_DATE_FIELD_NUMBER = 2;
  private long lastUpdatedDate_;
  /**
   * <code>optional int64 last_updated_date = 2;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  @java.lang.Override
  public boolean hasLastUpdatedDate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 last_updated_date = 2;</code>
   * @return The lastUpdatedDate.
   */
  @java.lang.Override
  public long getLastUpdatedDate() {
    return lastUpdatedDate_;
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
    getSerializedSize();
    if (getValuesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(valuesMemoizedSerializedSize);
    }
    for (int i = 0; i < values_.size(); i++) {
      output.writeInt64NoTag(values_.getLong(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(2, lastUpdatedDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < values_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(values_.getLong(i));
      }
      size += dataSize;
      if (!getValuesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      valuesMemoizedSerializedSize = dataSize;
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, lastUpdatedDate_);
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
    if (!(obj instanceof im.turms.common.model.bo.common.Int64ValuesWithVersion)) {
      return super.equals(obj);
    }
    im.turms.common.model.bo.common.Int64ValuesWithVersion other = (im.turms.common.model.bo.common.Int64ValuesWithVersion) obj;

    if (!getValuesList()
        .equals(other.getValuesList())) return false;
    if (hasLastUpdatedDate() != other.hasLastUpdatedDate()) return false;
    if (hasLastUpdatedDate()) {
      if (getLastUpdatedDate()
          != other.getLastUpdatedDate()) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    if (hasLastUpdatedDate()) {
      hash = (37 * hash) + LAST_UPDATED_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLastUpdatedDate());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.bo.common.Int64ValuesWithVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.common.Int64ValuesWithVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.common.Int64ValuesWithVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.common.Int64ValuesWithVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.common.Int64ValuesWithVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.common.Int64ValuesWithVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.common.Int64ValuesWithVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.common.Int64ValuesWithVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.bo.common.Int64ValuesWithVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.common.Int64ValuesWithVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.bo.common.Int64ValuesWithVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.common.Int64ValuesWithVersion parseFrom(
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
  public static Builder newBuilder(im.turms.common.model.bo.common.Int64ValuesWithVersion prototype) {
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
   * Protobuf type {@code im.turms.proto.Int64ValuesWithVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.Int64ValuesWithVersion)
      im.turms.common.model.bo.common.Int64ValuesWithVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.bo.common.Int64ValuesWithVersionOuterClass.internal_static_im_turms_proto_Int64ValuesWithVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.bo.common.Int64ValuesWithVersionOuterClass.internal_static_im_turms_proto_Int64ValuesWithVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.bo.common.Int64ValuesWithVersion.class, im.turms.common.model.bo.common.Int64ValuesWithVersion.Builder.class);
    }

    // Construct using im.turms.common.model.bo.common.Int64ValuesWithVersion.newBuilder()
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
      values_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      lastUpdatedDate_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.bo.common.Int64ValuesWithVersionOuterClass.internal_static_im_turms_proto_Int64ValuesWithVersion_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.bo.common.Int64ValuesWithVersion getDefaultInstanceForType() {
      return im.turms.common.model.bo.common.Int64ValuesWithVersion.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.bo.common.Int64ValuesWithVersion build() {
      im.turms.common.model.bo.common.Int64ValuesWithVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.bo.common.Int64ValuesWithVersion buildPartial() {
      im.turms.common.model.bo.common.Int64ValuesWithVersion result = new im.turms.common.model.bo.common.Int64ValuesWithVersion(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        values_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.values_ = values_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lastUpdatedDate_ = lastUpdatedDate_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof im.turms.common.model.bo.common.Int64ValuesWithVersion) {
        return mergeFrom((im.turms.common.model.bo.common.Int64ValuesWithVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.bo.common.Int64ValuesWithVersion other) {
      if (other == im.turms.common.model.bo.common.Int64ValuesWithVersion.getDefaultInstance()) return this;
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
        }
        onChanged();
      }
      if (other.hasLastUpdatedDate()) {
        setLastUpdatedDate(other.getLastUpdatedDate());
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
      im.turms.common.model.bo.common.Int64ValuesWithVersion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.bo.common.Int64ValuesWithVersion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList values_ = emptyLongList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = mutableCopy(values_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 values = 1;</code>
     * @return A list containing the values.
     */
    public java.util.List<java.lang.Long>
        getValuesList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(values_) : values_;
    }
    /**
     * <code>repeated int64 values = 1;</code>
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     * <code>repeated int64 values = 1;</code>
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public long getValues(int index) {
      return values_.getLong(index);
    }
    /**
     * <code>repeated int64 values = 1;</code>
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(
        int index, long value) {
      ensureValuesIsMutable();
      values_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 values = 1;</code>
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(long value) {
      ensureValuesIsMutable();
      values_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 values = 1;</code>
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, values_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 values = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private long lastUpdatedDate_ ;
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @return Whether the lastUpdatedDate field is set.
     */
    @java.lang.Override
    public boolean hasLastUpdatedDate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @return The lastUpdatedDate.
     */
    @java.lang.Override
    public long getLastUpdatedDate() {
      return lastUpdatedDate_;
    }
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @param value The lastUpdatedDate to set.
     * @return This builder for chaining.
     */
    public Builder setLastUpdatedDate(long value) {
      bitField0_ |= 0x00000002;
      lastUpdatedDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastUpdatedDate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lastUpdatedDate_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:im.turms.proto.Int64ValuesWithVersion)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.Int64ValuesWithVersion)
  private static final im.turms.common.model.bo.common.Int64ValuesWithVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.bo.common.Int64ValuesWithVersion();
  }

  public static im.turms.common.model.bo.common.Int64ValuesWithVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Int64ValuesWithVersion>
      PARSER = new com.google.protobuf.AbstractParser<Int64ValuesWithVersion>() {
    @java.lang.Override
    public Int64ValuesWithVersion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Int64ValuesWithVersion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Int64ValuesWithVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Int64ValuesWithVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.bo.common.Int64ValuesWithVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

