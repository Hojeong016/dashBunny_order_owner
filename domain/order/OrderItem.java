package com.devcourse.web2_1_dashbunny_be.domain.order;

import com.devcourse.web2_1_dashbunny_be.domain.owner.MenuManagement;
import jakarta.persistence.*;
import lombok.*;


/**
 * 걀제가 완료된 메뉴 정보가 담긴 entity.
 */
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long orderItemId; // 주문 항목 ID

  private String storeId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "order_id", nullable = false)
  private Orders order; // 해당 주문

  @ManyToOne(fetch = FetchType.LAZY, optional = true)
  @JoinColumn(name = "menu_id", nullable = true)
  private MenuManagement menu; // 메뉴 정보

  @Column(nullable = false)
  private int quantity; // 수량

  @Column(nullable = true)
  private Long totalPrice; // 총 합산 비용

  @Column(nullable = false)
  private boolean stockAvailableAtOrder; // 주문 당시의 재고 등록 여부
}
