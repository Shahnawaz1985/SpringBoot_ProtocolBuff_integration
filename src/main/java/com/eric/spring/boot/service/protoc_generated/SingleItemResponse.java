// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ItemsResponse.proto

package com.eric.spring.boot.service.protoc_generated;

/**
 * Protobuf type {@code SingleItemResponse}
 */
public final class SingleItemResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SingleItemResponse)
    SingleItemResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SingleItemResponse.newBuilder() to construct.
  private SingleItemResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SingleItemResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SingleItemResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SingleItemResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.eric.spring.boot.collections.protoc_generated.Items.Builder subBuilder = null;
            if (items_ != null) {
              subBuilder = items_.toBuilder();
            }
            items_ = input.readMessage(com.eric.spring.boot.collections.protoc_generated.Items.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(items_);
              items_ = subBuilder.buildPartial();
            }

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
    return com.eric.spring.boot.service.protoc_generated.ItemService.internal_static_SingleItemResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.eric.spring.boot.service.protoc_generated.ItemService.internal_static_SingleItemResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.eric.spring.boot.service.protoc_generated.SingleItemResponse.class, com.eric.spring.boot.service.protoc_generated.SingleItemResponse.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 1;
  private com.eric.spring.boot.collections.protoc_generated.Items items_;
  /**
   * <code>.Items items = 1;</code>
   * @return Whether the items field is set.
   */
  @java.lang.Override
  public boolean hasItems() {
    return items_ != null;
  }
  /**
   * <code>.Items items = 1;</code>
   * @return The items.
   */
  @java.lang.Override
  public com.eric.spring.boot.collections.protoc_generated.Items getItems() {
    return items_ == null ? com.eric.spring.boot.collections.protoc_generated.Items.getDefaultInstance() : items_;
  }
  /**
   * <code>.Items items = 1;</code>
   */
  @java.lang.Override
  public com.eric.spring.boot.collections.protoc_generated.ItemsOrBuilder getItemsOrBuilder() {
    return getItems();
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
    if (items_ != null) {
      output.writeMessage(1, getItems());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (items_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getItems());
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
    if (!(obj instanceof com.eric.spring.boot.service.protoc_generated.SingleItemResponse)) {
      return super.equals(obj);
    }
    com.eric.spring.boot.service.protoc_generated.SingleItemResponse other = (com.eric.spring.boot.service.protoc_generated.SingleItemResponse) obj;

    if (hasItems() != other.hasItems()) return false;
    if (hasItems()) {
      if (!getItems()
          .equals(other.getItems())) return false;
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
    if (hasItems()) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItems().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse parseFrom(
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
  public static Builder newBuilder(com.eric.spring.boot.service.protoc_generated.SingleItemResponse prototype) {
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
   * Protobuf type {@code SingleItemResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SingleItemResponse)
      com.eric.spring.boot.service.protoc_generated.SingleItemResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.eric.spring.boot.service.protoc_generated.ItemService.internal_static_SingleItemResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.eric.spring.boot.service.protoc_generated.ItemService.internal_static_SingleItemResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.eric.spring.boot.service.protoc_generated.SingleItemResponse.class, com.eric.spring.boot.service.protoc_generated.SingleItemResponse.Builder.class);
    }

    // Construct using com.eric.spring.boot.service.protoc_generated.SingleItemResponse.newBuilder()
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
      if (itemsBuilder_ == null) {
        items_ = null;
      } else {
        items_ = null;
        itemsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.eric.spring.boot.service.protoc_generated.ItemService.internal_static_SingleItemResponse_descriptor;
    }

    @java.lang.Override
    public com.eric.spring.boot.service.protoc_generated.SingleItemResponse getDefaultInstanceForType() {
      return com.eric.spring.boot.service.protoc_generated.SingleItemResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.eric.spring.boot.service.protoc_generated.SingleItemResponse build() {
      com.eric.spring.boot.service.protoc_generated.SingleItemResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.eric.spring.boot.service.protoc_generated.SingleItemResponse buildPartial() {
      com.eric.spring.boot.service.protoc_generated.SingleItemResponse result = new com.eric.spring.boot.service.protoc_generated.SingleItemResponse(this);
      if (itemsBuilder_ == null) {
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
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
      if (other instanceof com.eric.spring.boot.service.protoc_generated.SingleItemResponse) {
        return mergeFrom((com.eric.spring.boot.service.protoc_generated.SingleItemResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.eric.spring.boot.service.protoc_generated.SingleItemResponse other) {
      if (other == com.eric.spring.boot.service.protoc_generated.SingleItemResponse.getDefaultInstance()) return this;
      if (other.hasItems()) {
        mergeItems(other.getItems());
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
      com.eric.spring.boot.service.protoc_generated.SingleItemResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.eric.spring.boot.service.protoc_generated.SingleItemResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.eric.spring.boot.collections.protoc_generated.Items items_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.eric.spring.boot.collections.protoc_generated.Items, com.eric.spring.boot.collections.protoc_generated.Items.Builder, com.eric.spring.boot.collections.protoc_generated.ItemsOrBuilder> itemsBuilder_;
    /**
     * <code>.Items items = 1;</code>
     * @return Whether the items field is set.
     */
    public boolean hasItems() {
      return itemsBuilder_ != null || items_ != null;
    }
    /**
     * <code>.Items items = 1;</code>
     * @return The items.
     */
    public com.eric.spring.boot.collections.protoc_generated.Items getItems() {
      if (itemsBuilder_ == null) {
        return items_ == null ? com.eric.spring.boot.collections.protoc_generated.Items.getDefaultInstance() : items_;
      } else {
        return itemsBuilder_.getMessage();
      }
    }
    /**
     * <code>.Items items = 1;</code>
     */
    public Builder setItems(com.eric.spring.boot.collections.protoc_generated.Items value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        items_ = value;
        onChanged();
      } else {
        itemsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Items items = 1;</code>
     */
    public Builder setItems(
        com.eric.spring.boot.collections.protoc_generated.Items.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        items_ = builderForValue.build();
        onChanged();
      } else {
        itemsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Items items = 1;</code>
     */
    public Builder mergeItems(com.eric.spring.boot.collections.protoc_generated.Items value) {
      if (itemsBuilder_ == null) {
        if (items_ != null) {
          items_ =
            com.eric.spring.boot.collections.protoc_generated.Items.newBuilder(items_).mergeFrom(value).buildPartial();
        } else {
          items_ = value;
        }
        onChanged();
      } else {
        itemsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Items items = 1;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = null;
        onChanged();
      } else {
        items_ = null;
        itemsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Items items = 1;</code>
     */
    public com.eric.spring.boot.collections.protoc_generated.Items.Builder getItemsBuilder() {
      
      onChanged();
      return getItemsFieldBuilder().getBuilder();
    }
    /**
     * <code>.Items items = 1;</code>
     */
    public com.eric.spring.boot.collections.protoc_generated.ItemsOrBuilder getItemsOrBuilder() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilder();
      } else {
        return items_ == null ?
            com.eric.spring.boot.collections.protoc_generated.Items.getDefaultInstance() : items_;
      }
    }
    /**
     * <code>.Items items = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.eric.spring.boot.collections.protoc_generated.Items, com.eric.spring.boot.collections.protoc_generated.Items.Builder, com.eric.spring.boot.collections.protoc_generated.ItemsOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.eric.spring.boot.collections.protoc_generated.Items, com.eric.spring.boot.collections.protoc_generated.Items.Builder, com.eric.spring.boot.collections.protoc_generated.ItemsOrBuilder>(
                getItems(),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:SingleItemResponse)
  }

  // @@protoc_insertion_point(class_scope:SingleItemResponse)
  private static final com.eric.spring.boot.service.protoc_generated.SingleItemResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.eric.spring.boot.service.protoc_generated.SingleItemResponse();
  }

  public static com.eric.spring.boot.service.protoc_generated.SingleItemResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SingleItemResponse>
      PARSER = new com.google.protobuf.AbstractParser<SingleItemResponse>() {
    @java.lang.Override
    public SingleItemResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SingleItemResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SingleItemResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SingleItemResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.eric.spring.boot.service.protoc_generated.SingleItemResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

