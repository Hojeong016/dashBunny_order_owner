package com.devcourse.web2_1_dashbunny_be.feature.order.controller.dto.user;

import com.devcourse.web2_1_dashbunny_be.domain.owner.StoreManagement;
import com.devcourse.web2_1_dashbunny_be.domain.order.Orders;
import com.devcourse.web2_1_dashbunny_be.domain.order.OrderStatus;
import com.devcourse.web2_1_dashbunny_be.feature.owner.store.repository.StoreManagementRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserOrderInfoRequestDto {

    private Long orderId;
    private String storeId; // 가게 ID
    private String userPhone;
    private String storeName;
    private String storeLogo;
    private LocalDateTime orderDate; // 주문 날짜
    private int totalQuantity;
    private String menuName;
    private Long totalPrice;
    private OrderStatus orderStatus;

    public static UserOrderInfoRequestDto todo(Orders orders,
                                               StoreManagementRepository storeManagementRepository,
                                               int totalQuantity,
                                               String menuName) {
    StoreManagement storeManagement = storeManagementRepository.findByStoreId(orders.getStore().getStoreId());
        if (storeManagement == null) {
            throw new IllegalArgumentException("storeId에 대한 스토어를 찾을 수 없습니다: " + orders.getStore().getStoreId());
        }

    return UserOrderInfoRequestDto.builder()
            .orderId(orders.getOrderId())
                .storeId(orders.getStore().getStoreId())
                .userPhone(orders.getUser().getPhone())
                .storeName(storeManagement.getStoreName())
                .storeLogo(storeManagement.getStoreLogo())
                .orderDate(orders.getOrderDate())
                .totalQuantity(totalQuantity)
                .menuName(menuName)
                .totalPrice(orders.getTotalPrice())
                .orderStatus(orders.getOrderStatus()).build();

    }

}
