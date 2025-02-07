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
  
  private Integer car;
  private Integer house;
  private Integer phone;
  private Integer computer;
  
  public Purchase() {
  }
  
  public Purchase(Long id, String user, Integer car, Integer house, Integer phone, Integer computer) {
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
