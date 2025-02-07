package com.financial.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.financial.dto.PurchaseDTO;
import com.financial.services.PurchaseService;

@RestController
@RequestMapping(value = "/purchase")
public class PurchaseController {
  
  @Autowired
  private PurchaseService purchaseService;
  
  @GetMapping
  public List<PurchaseDTO> findAll() {
    return purchaseService.findAll();
  }
}
