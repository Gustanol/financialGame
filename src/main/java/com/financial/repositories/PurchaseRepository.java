package com.financial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financial.entities.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
  
}
