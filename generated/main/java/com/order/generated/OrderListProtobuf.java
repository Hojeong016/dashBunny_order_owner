// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: OrderList.proto
// Protobuf Java Version: 4.29.1

package com.order.generated;

public final class OrderListProtobuf {
  private OrderListProtobuf() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      OrderListProtobuf.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OrderListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OrderList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 주문 메뉴 이름 리스트
     * </pre>
     *
     * <code>repeated string menuName = 1;</code>
     * @return A list containing the menuName.
     */
    java.util.List<java.lang.String>
        getMenuNameList();
    /**
     * <pre>
     * 주문 메뉴 이름 리스트
     * </pre>
     *
     * <code>repeated string menuName = 1;</code>
     * @return The count of menuName.
     */
    int getMenuNameCount();
    /**
     * <pre>
     * 주문 메뉴 이름 리스트
     * </pre>
     *
     * <code>repeated string menuName = 1;</code>
     * @param index The index of the element to return.
     * @return The menuName at the given index.
     */
    java.lang.String getMenuName(int index);
    /**
     * <pre>
     * 주문 메뉴 이름 리스트
     * </pre>
     *
     * <code>repeated string menuName = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the menuName at the given index.
     */
    com.google.protobuf.ByteString
        getMenuNameBytes(int index);

    /**
     * <pre>
     * 준비 시간
     * </pre>
     *
     * <code>int32 preparationTime = 2;</code>
     * @return The preparationTime.
     */
    int getPreparationTime();

    /**
     * <pre>
     * 총 금액
     * </pre>
     *
     * <code>int64 totalPrice = 3;</code>
     * @return The totalPrice.
     */
    long getTotalPrice();
  }
  /**
   * <pre>
   * 주문 목록 메시지
   * </pre>
   *
   * Protobuf type {@code OrderList}
   */
  public static final class OrderList extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:OrderList)
      OrderListOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 1,
        /* suffix= */ "",
        OrderList.class.getName());
    }
    // Use OrderList.newBuilder() to construct.
    private OrderList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private OrderList() {
      menuName_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.order.generated.OrderListProtobuf.internal_static_OrderList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.order.generated.OrderListProtobuf.internal_static_OrderList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.order.generated.OrderListProtobuf.OrderList.class, com.order.generated.OrderListProtobuf.OrderList.Builder.class);
    }

    public static final int MENUNAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList menuName_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <pre>
     * 주문 메뉴 이름 리스트
     * </pre>
     *
     * <code>repeated string menuName = 1;</code>
     * @return A list containing the menuName.
     */
    public com.google.protobuf.ProtocolStringList
        getMenuNameList() {
      return menuName_;
    }
    /**
     * <pre>
     * 주문 메뉴 이름 리스트
     * </pre>
     *
     * <code>repeated string menuName = 1;</code>
     * @return The count of menuName.
     */
    public int getMenuNameCount() {
      return menuName_.size();
    }
    /**
     * <pre>
     * 주문 메뉴 이름 리스트
     * </pre>
     *
     * <code>repeated string menuName = 1;</code>
     * @param index The index of the element to return.
     * @return The menuName at the given index.
     */
    public java.lang.String getMenuName(int index) {
      return menuName_.get(index);
    }
    /**
     * <pre>
     * 주문 메뉴 이름 리스트
     * </pre>
     *
     * <code>repeated string menuName = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the menuName at the given index.
     */
    public com.google.protobuf.ByteString
        getMenuNameBytes(int index) {
      return menuName_.getByteString(index);
    }

    public static final int PREPARATIONTIME_FIELD_NUMBER = 2;
    private int preparationTime_ = 0;
    /**
     * <pre>
     * 준비 시간
     * </pre>
     *
     * <code>int32 preparationTime = 2;</code>
     * @return The preparationTime.
     */
    @java.lang.Override
    public int getPreparationTime() {
      return preparationTime_;
    }

    public static final int TOTALPRICE_FIELD_NUMBER = 3;
    private long totalPrice_ = 0L;
    /**
     * <pre>
     * 총 금액
     * </pre>
     *
     * <code>int64 totalPrice = 3;</code>
     * @return The totalPrice.
     */
    @java.lang.Override
    public long getTotalPrice() {
      return totalPrice_;
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
      for (int i = 0; i < menuName_.size(); i++) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, menuName_.getRaw(i));
      }
      if (preparationTime_ != 0) {
        output.writeInt32(2, preparationTime_);
      }
      if (totalPrice_ != 0L) {
        output.writeInt64(3, totalPrice_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < menuName_.size(); i++) {
          dataSize += computeStringSizeNoTag(menuName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getMenuNameList().size();
      }
      if (preparationTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, preparationTime_);
      }
      if (totalPrice_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, totalPrice_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.order.generated.OrderListProtobuf.OrderList)) {
        return super.equals(obj);
      }
      com.order.generated.OrderListProtobuf.OrderList other = (com.order.generated.OrderListProtobuf.OrderList) obj;

      if (!getMenuNameList()
          .equals(other.getMenuNameList())) return false;
      if (getPreparationTime()
          != other.getPreparationTime()) return false;
      if (getTotalPrice()
          != other.getTotalPrice()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getMenuNameCount() > 0) {
        hash = (37 * hash) + MENUNAME_FIELD_NUMBER;
        hash = (53 * hash) + getMenuNameList().hashCode();
      }
      hash = (37 * hash) + PREPARATIONTIME_FIELD_NUMBER;
      hash = (53 * hash) + getPreparationTime();
      hash = (37 * hash) + TOTALPRICE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTotalPrice());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.order.generated.OrderListProtobuf.OrderList parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.order.generated.OrderListProtobuf.OrderList parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.order.generated.OrderListProtobuf.OrderList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.order.generated.OrderListProtobuf.OrderList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.order.generated.OrderListProtobuf.OrderList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.order.generated.OrderListProtobuf.OrderList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.order.generated.OrderListProtobuf.OrderList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.order.generated.OrderListProtobuf.OrderList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.order.generated.OrderListProtobuf.OrderList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.order.generated.OrderListProtobuf.OrderList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.order.generated.OrderListProtobuf.OrderList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.order.generated.OrderListProtobuf.OrderList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.order.generated.OrderListProtobuf.OrderList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 주문 목록 메시지
     * </pre>
     *
     * Protobuf type {@code OrderList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OrderList)
        com.order.generated.OrderListProtobuf.OrderListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.order.generated.OrderListProtobuf.internal_static_OrderList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.order.generated.OrderListProtobuf.internal_static_OrderList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.order.generated.OrderListProtobuf.OrderList.class, com.order.generated.OrderListProtobuf.OrderList.Builder.class);
      }

      // Construct using com.order.generated.OrderListProtobuf.OrderList.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        menuName_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        preparationTime_ = 0;
        totalPrice_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.order.generated.OrderListProtobuf.internal_static_OrderList_descriptor;
      }

      @java.lang.Override
      public com.order.generated.OrderListProtobuf.OrderList getDefaultInstanceForType() {
        return com.order.generated.OrderListProtobuf.OrderList.getDefaultInstance();
      }

      @java.lang.Override
      public com.order.generated.OrderListProtobuf.OrderList build() {
        com.order.generated.OrderListProtobuf.OrderList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.order.generated.OrderListProtobuf.OrderList buildPartial() {
        com.order.generated.OrderListProtobuf.OrderList result = new com.order.generated.OrderListProtobuf.OrderList(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.order.generated.OrderListProtobuf.OrderList result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          menuName_.makeImmutable();
          result.menuName_ = menuName_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.preparationTime_ = preparationTime_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.totalPrice_ = totalPrice_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.order.generated.OrderListProtobuf.OrderList) {
          return mergeFrom((com.order.generated.OrderListProtobuf.OrderList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.order.generated.OrderListProtobuf.OrderList other) {
        if (other == com.order.generated.OrderListProtobuf.OrderList.getDefaultInstance()) return this;
        if (!other.menuName_.isEmpty()) {
          if (menuName_.isEmpty()) {
            menuName_ = other.menuName_;
            bitField0_ |= 0x00000001;
          } else {
            ensureMenuNameIsMutable();
            menuName_.addAll(other.menuName_);
          }
          onChanged();
        }
        if (other.getPreparationTime() != 0) {
          setPreparationTime(other.getPreparationTime());
        }
        if (other.getTotalPrice() != 0L) {
          setTotalPrice(other.getTotalPrice());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
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
                ensureMenuNameIsMutable();
                menuName_.add(s);
                break;
              } // case 10
              case 16: {
                preparationTime_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                totalPrice_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringArrayList menuName_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureMenuNameIsMutable() {
        if (!menuName_.isModifiable()) {
          menuName_ = new com.google.protobuf.LazyStringArrayList(menuName_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <pre>
       * 주문 메뉴 이름 리스트
       * </pre>
       *
       * <code>repeated string menuName = 1;</code>
       * @return A list containing the menuName.
       */
      public com.google.protobuf.ProtocolStringList
          getMenuNameList() {
        menuName_.makeImmutable();
        return menuName_;
      }
      /**
       * <pre>
       * 주문 메뉴 이름 리스트
       * </pre>
       *
       * <code>repeated string menuName = 1;</code>
       * @return The count of menuName.
       */
      public int getMenuNameCount() {
        return menuName_.size();
      }
      /**
       * <pre>
       * 주문 메뉴 이름 리스트
       * </pre>
       *
       * <code>repeated string menuName = 1;</code>
       * @param index The index of the element to return.
       * @return The menuName at the given index.
       */
      public java.lang.String getMenuName(int index) {
        return menuName_.get(index);
      }
      /**
       * <pre>
       * 주문 메뉴 이름 리스트
       * </pre>
       *
       * <code>repeated string menuName = 1;</code>
       * @param index The index of the value to return.
       * @return The bytes of the menuName at the given index.
       */
      public com.google.protobuf.ByteString
          getMenuNameBytes(int index) {
        return menuName_.getByteString(index);
      }
      /**
       * <pre>
       * 주문 메뉴 이름 리스트
       * </pre>
       *
       * <code>repeated string menuName = 1;</code>
       * @param index The index to set the value at.
       * @param value The menuName to set.
       * @return This builder for chaining.
       */
      public Builder setMenuName(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureMenuNameIsMutable();
        menuName_.set(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 주문 메뉴 이름 리스트
       * </pre>
       *
       * <code>repeated string menuName = 1;</code>
       * @param value The menuName to add.
       * @return This builder for chaining.
       */
      public Builder addMenuName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureMenuNameIsMutable();
        menuName_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 주문 메뉴 이름 리스트
       * </pre>
       *
       * <code>repeated string menuName = 1;</code>
       * @param values The menuName to add.
       * @return This builder for chaining.
       */
      public Builder addAllMenuName(
          java.lang.Iterable<java.lang.String> values) {
        ensureMenuNameIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, menuName_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 주문 메뉴 이름 리스트
       * </pre>
       *
       * <code>repeated string menuName = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMenuName() {
        menuName_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 주문 메뉴 이름 리스트
       * </pre>
       *
       * <code>repeated string menuName = 1;</code>
       * @param value The bytes of the menuName to add.
       * @return This builder for chaining.
       */
      public Builder addMenuNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureMenuNameIsMutable();
        menuName_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int preparationTime_ ;
      /**
       * <pre>
       * 준비 시간
       * </pre>
       *
       * <code>int32 preparationTime = 2;</code>
       * @return The preparationTime.
       */
      @java.lang.Override
      public int getPreparationTime() {
        return preparationTime_;
      }
      /**
       * <pre>
       * 준비 시간
       * </pre>
       *
       * <code>int32 preparationTime = 2;</code>
       * @param value The preparationTime to set.
       * @return This builder for chaining.
       */
      public Builder setPreparationTime(int value) {

        preparationTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 준비 시간
       * </pre>
       *
       * <code>int32 preparationTime = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPreparationTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        preparationTime_ = 0;
        onChanged();
        return this;
      }

      private long totalPrice_ ;
      /**
       * <pre>
       * 총 금액
       * </pre>
       *
       * <code>int64 totalPrice = 3;</code>
       * @return The totalPrice.
       */
      @java.lang.Override
      public long getTotalPrice() {
        return totalPrice_;
      }
      /**
       * <pre>
       * 총 금액
       * </pre>
       *
       * <code>int64 totalPrice = 3;</code>
       * @param value The totalPrice to set.
       * @return This builder for chaining.
       */
      public Builder setTotalPrice(long value) {

        totalPrice_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 총 금액
       * </pre>
       *
       * <code>int64 totalPrice = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalPrice() {
        bitField0_ = (bitField0_ & ~0x00000004);
        totalPrice_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:OrderList)
    }

    // @@protoc_insertion_point(class_scope:OrderList)
    private static final com.order.generated.OrderListProtobuf.OrderList DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.order.generated.OrderListProtobuf.OrderList();
    }

    public static com.order.generated.OrderListProtobuf.OrderList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OrderList>
        PARSER = new com.google.protobuf.AbstractParser<OrderList>() {
      @java.lang.Override
      public OrderList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<OrderList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OrderList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.order.generated.OrderListProtobuf.OrderList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OrderList_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_OrderList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017OrderList.proto\"J\n\tOrderList\022\020\n\010menuNa" +
      "me\030\001 \003(\t\022\027\n\017preparationTime\030\002 \001(\005\022\022\n\ntot" +
      "alPrice\030\003 \001(\003B(\n\023com.order.generatedB\021Or" +
      "derListProtobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OrderList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OrderList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_OrderList_descriptor,
        new java.lang.String[] { "MenuName", "PreparationTime", "TotalPrice", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}