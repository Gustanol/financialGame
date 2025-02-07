package com.financial.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.financial.repositories.PurchaseRepository;
import com.financial.dto.PurchaseDTO;
import com.financial.entities.Purchase;

@Service
public class PurchaseService {
  
  @Autowired
  private PurchaseRepository purchaseRepository;
  
  @Transactional(readOnly = true)
  public List<PurchaseDTO> findAll() {
    List<Purchase> bill = purchaseRepository.findAll();
    return bill.stream().map(purchase -> new PurchaseDTO(purchase)).toList();
  }
}
