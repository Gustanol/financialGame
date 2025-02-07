package com.financial.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.financial.repositories.PurchaseRepository;
import com.financial.repositories.ItemsRepository;
import com.financial.repositories.UsersRepository;
import com.financial.dto.PurchaseDTO;
import com.financial.entities.Purchase;

@Service
public class PurchaseService {
  
  @Autowired
  private PurchaseRepository purchaseRepository;
  
  @Autowired
  private UsersRepository usersRepository;
  
  @Autowired
  private ItemsRepository itemsRepository;
  
  @Transactional(readOnly = true)
  public List<PurchaseDTO> findAll() {
    List<Purchase> bill = purchaseRepository.findAll();
    return bill.stream().map(purchase -> new PurchaseDTO(purchase)).toList();
  }
  
  @Transactional(readOnly = true)
  public void shopping(String user, String item, Integer amount) {
    Double cost = itemsRepository.itemCost(item);
    switch (item) {
        case "car" -> purchaseRepository.buyCar(user, amount);
        case "house" -> purchaseRepository.buyHouse(user, amount);
        case "phone" -> purchaseRepository.buyPhone(user, amount);
        case "computer" -> purchaseRepository.buyComputer(user, amount);
    } 
    usersRepository.withdrawMoneyMult(cost, user, amount);
  }
}
