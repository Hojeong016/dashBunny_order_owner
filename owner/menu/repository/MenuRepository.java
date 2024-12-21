package com.devcourse.web2_1_dashbunny_be.feature.owner.menu.repository;

import com.devcourse.web2_1_dashbunny_be.domain.owner.MenuManagement;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


/**
 * 메뉴 그룹 레포지토리 인터페이스.
 */
@Repository
public interface MenuRepository extends JpaRepository<MenuManagement, Long> {

  /**
  * storeId를 기준으로 엔티티를 찾아냔다..
  */
  @Query("SELECT m FROM MenuManagement m WHERE m.storeId = :storeId")
  List<MenuManagement> findAllByStoreId(@Param("storeId") String storeId);

  @Query("SELECT m.menuName As menuName From MenuManagement m WHERE m.storeId = :storeId")
  Optional<List<String>> findAllMenuNamesByStoreId(@Param("storeId") String storeId);

  // storeId, menuName 을 조건으로 1행 출력
  @Query("SELECT m FROM MenuManagement m WHERE m.storeId = :storeId AND m.menuName = :menuName")
  Optional<MenuManagement> findByStoreIdAndMenuName(@Param("storeId") String storeId, @Param("menuName") String menuName);

  MenuManagement findByStoreId(String storeId);
  /*  // 메뉴명이 포함된 모든 메뉴를 검색
    @Query("SELECT m FROM MenuManagement m WHERE m.menuName LIKE %:menuName%")
    List<MenuManagement> findByMenuNameContaining(String menuName);

    List<MenuManagement> findByStoreId(String storeId);

    List<MenuManagement> findByMenuGroupId(Long groupId);

    List<MenuManagement> findByGroupId(String groupId); // 그룹 ID로 메뉴 조회

    Optional<MenuManagement> findById(Long menuId); // ID로 단일 메뉴 조회*/

  @Query("SELECT m.menuId FROM MenuManagement m WHERE m.storeId = :storeId AND m.menuName = :menuName")
  Optional<Long> findMenuIdByStoreIdAndMenuName(@Param("storeId") String storeId, @Param("menuName") String menuName);

}
