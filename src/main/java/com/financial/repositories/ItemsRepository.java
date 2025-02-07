package com.financial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financial.entities.Items;

public interface ItemsRepository extends JpaRepository<Items, Long> {
  
}
