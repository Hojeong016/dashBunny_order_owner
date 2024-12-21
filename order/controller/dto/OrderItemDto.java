package com.devcourse.web2_1_dashbunny_be.feature.order.controller.dto;

import com.devcourse.web2_1_dashbunny_be.domain.owner.MenuManagement;
import com.devcourse.web2_1_dashbunny_be.domain.user.CartItem;
import com.devcourse.web2_1_dashbunny_be.domain.order.OrderItem;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 장바구니에서 결제가 완료된 상품들의 정보가 담기는 dto.
 */
@Getter
@Setter
@Builder
public class OrderItemDto {

  private Long menuId; // 메뉴 ID
  private String menuName; // 메뉴 이름
  private boolean stockAvailableAtOrder; // 재고 여부
  private Integer quantity; // 수량
  private Long price; // 총 금액 (단가 * 수량)

  /**
   * 엔티티를 변환을 휘한 메서드.
   */
  public OrderItem toEntity(MenuManagement menu) {
    OrderItem orderItem = new OrderItem();
    orderItem.setMenu(menu);
    orderItem.setStockAvailableAtOrder(this.stockAvailableAtOrder);
    orderItem.setQuantity(quantity);
    orderItem.setTotalPrice(menu.getPrice() * this.quantity);
    return orderItem;
  }

  public static OrderItemDto fromEntity(OrderItem orderItem) {
    return OrderItemDto.builder()
            .menuId(orderItem.getMenu().getMenuId())
            .menuName(orderItem.getMenu().getMenuName())
            .stockAvailableAtOrder(orderItem.isStockAvailableAtOrder())
            .quantity(orderItem.getQuantity())
            .price(orderItem.getTotalPrice())
            .build();
  }

  public static OrderItemDto toDto(CartItem cartItem) {
    return OrderItemDto.builder()
            .menuId(cartItem.getMenuManagement().getMenuId())
            .menuName(cartItem.getMenuManagement().getMenuName())
            .quantity(cartItem.getQuantity().intValue())
            .price(cartItem.getMenuManagement().getPrice())
            .build();//* cartItem.getQuantity()).build();
  }
}
