package com.devcourse.web2_1_dashbunny_be.feature.order.controller.dto;

import com.devcourse.web2_1_dashbunny_be.domain.order.Orders;
import com.devcourse.web2_1_dashbunny_be.domain.order.OrderStatus;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AcceptOrdersResponseDto {
    private Long orderId;
    private String storeId;
    private int preparationTime;
    private OrderStatus orderStatus;

    public static AcceptOrdersResponseDto fromEntity(Orders order) {
        return AcceptOrdersResponseDto.builder()
                .orderId(order.getOrderId())
                .storeId(order.getStore().getStoreId())
                .preparationTime(order.getPreparationTime())
                .orderStatus(order.getOrderStatus())
                .build();
    }
}
