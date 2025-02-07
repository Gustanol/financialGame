package com.financial.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.financial.repositories.ItemsRepository;
import com.financial.dto.ItemsDTO;
import com.financial.entities.Items;

@Service
public class ItemsService {
  
  @Autowired
  private ItemsRepository itemsRepository;
  
  @Transactional(readOnly = true)
  public List<ItemsDTO> findAll() {
    List<Items> items = itemsRepository.findAll();
    return items.stream().map(item -> new ItemsDTO(item)).toList();
  }
}
