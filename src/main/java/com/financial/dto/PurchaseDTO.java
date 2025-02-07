package com.financial.dto;

import com.financial.entities.Purchase;

public class PurchaseDTO {
  private String user;
  private String car;
  private String house;
  private String phone;
  private String computer;
  
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
  
  public String getCar() {
    return car;
  }
  
  public void setCar(String car) {
    this.car = car;
  }
  
  public String getHouse() {
    return house;
  }
  
  public void setHouse(String house) {
    this.house = house;
  }
  
  public String getPhone() {
    return phone;
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }
  
  public String getComputer() {
    return computer;
  }
  
  public void setComputer(String computer) {
    this.computer = computer;
  }
}
