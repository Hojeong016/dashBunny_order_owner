package com.devcourse.web2_1_dashbunny_be.feature.owner.dto.menu;

import com.devcourse.web2_1_dashbunny_be.domain.owner.MenuManagement;
import lombok.Builder;
import lombok.Getter;

/**
 * 메뉴 단건 조회 DTO 클래스.
 */
@Getter
@Builder
public class MenuResponseDto {
  private Long menuId;
  private String menuName;
  private Long menuGroupId;
  private String menuGroupName;
  private String menuContent;
  private Long price;
  private Boolean stockAvailable;
  private int menuStock;
  private Boolean isSoldOut;

  public static MenuResponseDto fromEntity(MenuManagement menu) {
    return MenuResponseDto.builder()
            .menuId(menu.getMenuId())
            .menuName(menu.getMenuName())
            .menuGroupId(menu.getMenuGroup() != null ? menu.getMenuGroup().getGroupId() : null)
            .menuGroupName(menu.getMenuGroup() != null ? menu.getMenuGroup().getGroupName() : null)
            .menuContent(menu.getMenuContent())
            .price(menu.getPrice())
            .stockAvailable(menu.isStockAvailable())
            .menuStock(menu.getMenuStock())
            .isSoldOut(menu.getIsSoldOut())
            .build();
  }
}