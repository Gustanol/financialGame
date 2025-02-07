package com.financial.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.financial.services.ItemsService;
import com.financial.dto.ItemsDTO;

@RestController
@RequestMapping(value = "/items")
public class ItemsController {
  
  @Autowired
  private ItemsService itemsService;
  
  @GetMapping
  public List<ItemsDTO> findAll() {
    return itemsService.findAll();
  }
}
