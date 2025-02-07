package com.financial.dto;

import com.financial.entities.Purchase;

public class PurchaseDTO {
  private String user;
  private Integer car;
  private Integer house;
  private Integer phone;
  private Integer computer;
  
  public PurchaseDTO() {
  }
  
  public PurchaseDTO(Purchase entity) {
    user = entity.getUser();
    car = entity.getCar();
    house = entity.getHouse();
    phone = entity.getPhone();
    computer = entity.getComputer();
  }
  
  public String getUser() {
    return user;
  }
  
  public void setUser(String user) {
    this.user = user;
  }
  
  public Integer getCar() {
    return car;
  }
  
  public void setCar(Integer car) {
    this.car = car;
  }
  
  public Integer getHouse() {
    return house;
  }
  
  public void setHouse(Integer house) {
    this.house = house;
  }
  
  public Integer getPhone() {
    return phone;
  }
  
  public void setPhone(Integer phone) {
    this.phone = phone;
  }
  
  public Integer getComputer() {
    return computer;
  }
  
  public void setComputer(Integer computer) {
    this.computer = computer;
  }
}
