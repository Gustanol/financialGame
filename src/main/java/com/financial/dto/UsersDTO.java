package com.financial.dto;

import com.financial.entities.Users;

public class UsersDTO {
  private Long id;
  private String name;
  private Double cash;
  
  public UsersDTO() {
  }
  
  public UsersDTO(Users entity) {
    id = entity.getId();
    name = entity.getName();
    cash = entity.getCash();
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
  
  public Double getCash() {
    return cash;
  }
  
  public void setCash(Double cash) {
    this.cash = cash;
  }
}
