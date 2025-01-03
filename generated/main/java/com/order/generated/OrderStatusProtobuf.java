// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: OrderStatus.proto
// Protobuf Java Version: 4.29.1

package com.order.generated;

public final class OrderStatusProtobuf {
  private OrderStatusProtobuf() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      OrderStatusProtobuf.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * 주문 상태를 정의하는 ENUM
   * </pre>
   *
   * Protobuf enum {@code OrderStatus}
   */
  public enum OrderStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * 주문 대기 중 (접수 대기)
     * </pre>
     *
     * <code>PENDING = 1;</code>
     */
    PENDING(1),
    /**
     * <pre>
     * 조리 중
     * </pre>
     *
     * <code>IN_PROGRESS = 2;</code>
     */
    IN_PROGRESS(2),
    /**
     * <pre>
     * 주문 거절
     * </pre>
     *
     * <code>DECLINED = 3;</code>
     */
    DECLINED(3),
    /**
     * <pre>
     * 배달 중
     * </pre>
     *
     * <code>OUT_FOR_DELIVERY = 4;</code>
     */
    OUT_FOR_DELIVERY(4),
    /**
     * <pre>
     * 배달 완료
     * </pre>
     *
     * <code>DELIVERED = 5;</code>
     */
    DELIVERED(5),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 1,
        /* suffix= */ "",
        OrderStatus.class.getName());
    }
    /**
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * 주문 대기 중 (접수 대기)
     * </pre>
     *
     * <code>PENDING = 1;</code>
     */
    public static final int PENDING_VALUE = 1;
    /**
     * <pre>
     * 조리 중
     * </pre>
     *
     * <code>IN_PROGRESS = 2;</code>
     */
    public static final int IN_PROGRESS_VALUE = 2;
    /**
     * <pre>
     * 주문 거절
     * </pre>
     *
     * <code>DECLINED = 3;</code>
     */
    public static final int DECLINED_VALUE = 3;
    /**
     * <pre>
     * 배달 중
     * </pre>
     *
     * <code>OUT_FOR_DELIVERY = 4;</code>
     */
    public static final int OUT_FOR_DELIVERY_VALUE = 4;
    /**
     * <pre>
     * 배달 완료
     * </pre>
     *
     * <code>DELIVERED = 5;</code>
     */
    public static final int DELIVERED_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OrderStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OrderStatus forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return PENDING;
        case 2: return IN_PROGRESS;
        case 3: return DECLINED;
        case 4: return OUT_FOR_DELIVERY;
        case 5: return DELIVERED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OrderStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OrderStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OrderStatus>() {
            public OrderStatus findValueByNumber(int number) {
              return OrderStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.order.generated.OrderStatusProtobuf.getDescriptor().getEnumTypes().get(0);
    }

    private static final OrderStatus[] VALUES = values();

    public static OrderStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OrderStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:OrderStatus)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OrderStatus.proto*o\n\013OrderStatus\022\017\n\013UN" +
      "SPECIFIED\020\000\022\013\n\007PENDING\020\001\022\017\n\013IN_PROGRESS\020" +
      "\002\022\014\n\010DECLINED\020\003\022\024\n\020OUT_FOR_DELIVERY\020\004\022\r\n" +
      "\tDELIVERED\020\005B*\n\023com.order.generatedB\023Ord" +
      "erStatusProtobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
