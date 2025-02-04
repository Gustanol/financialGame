package com.financial.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "users")
public class Users {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String name;
  private Double cash;
  
  public Users() {
  }
  
  public Users(Long id, String name, Double cash) {
    this.id = id;
    this.name = name;
    this.cash = cash;
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
  
  public void setName(String neme) {
    this.name = name;
  }
  
  public Double getCash() {
    return name;
  }
  
  public void setCash(Double cash) {
    this.cash = cash;
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
    Users other = (Users) obj;
      return Objects.equals(id, other.id);
  }
}
