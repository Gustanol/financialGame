package com.financial.dto;

import com.financial.entities.Items;

public class ItemsDTO {
  private String name;
  private Double cost;
  
  public ItemsDTO() {
  }
  
  public ItemsDTO(Items items) {
    name = items.getName();
    cost = items.getCost();
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
