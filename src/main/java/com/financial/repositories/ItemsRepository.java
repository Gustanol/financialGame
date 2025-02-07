package com.financial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.financial.entities.Items;

public interface ItemsRepository extends JpaRepository<Items, Long> {
  
  @Transactional
  @Query(nativeQuery = true, value = "SELECT cost FROM items WHERE name = :item")
  Double itemCost(@Param("item") String item);
}
