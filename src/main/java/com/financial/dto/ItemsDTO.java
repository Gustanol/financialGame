package com.financial.dto;

import com.financial.entities.Items;

public class ItemsDTO {
  private Long id;
  private String name;
  private Double cost;
  
  public ItemsDTO() {
  }
  
  public ItemsDTO(Items items) {
    id = items.getId();
    name = items.getName();
    cost = items.getCost();
  }
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Double getCost() {
    return cost;
  }
  
  public void setCost(Double cost) {
    this.cost = cost;
  }
}
