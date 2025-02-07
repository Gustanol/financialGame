package com.financial.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;

@Entity
@Table(name = "purchase")
public class Purchase {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "username")
  private String user;
  
  private String car;
  private String house;
  private String phone;
  private String computer;
  
  public Purchase() {
  }
  
  public Purchase(Long id, String user, String car, String house, String phone, String computer) {
    this.id = id;
    this.user = user;
    this.car = car;
    this.house = house;
    this.phone = phone;
    this.computer = computer;
  }
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
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
  
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Purchase other = (Purchase) obj;
      return Objects.equals(id, other.id);
  }
}
