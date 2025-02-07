package com.financial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.financial.entities.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
  
  @Modifying
  @Transactional
  @Query(nativeQuery = true, value = "INSERT INTO purchase (username) VALUES (:user)")
  void addUser(@Param("user") String user);
  
  @Modifying
  @Transactional
  @Query(nativeQuery = true, value = "DELETE FROM purchase WHERE username = :user")
  void removeUser(@Param("user") String user);
  
  @Modifying
  @Transactional
  @Query(nativeQuery = true, value = "UPDATE purchase SET car = CASE WHEN car IS NULL THEN :amount ELSE car + :amount END WHERE username = :user")
  void buyCar(@Param("user") String user, @Param("amount") Integer amount); 
  
  @Modifying
  @Transactional
  @Query(nativeQuery = true, value = "UPDATE purchase SET house = CASE WHEN house IS NULL THEN :amount ELSE house + :amount END WHERE username = :user")
  void buyHouse(@Param("user") String user, @Param("amount") Integer amount);
  
  @Modifying
  @Transactional
  @Query(nativeQuery = true, value = "UPDATE purchase SET phone = CASE WHEN phone IS NULL THEN :amount ELSE phone + :amount END WHERE username = :user")
  void buyPhone(@Param("user") String user, @Param("amount") Integer amount);
  
  @Modifying
  @Transactional
  @Query(nativeQuery = true, value = "UPDATE purchase SET computer = CASE WHEN computer IS NULL THEN :amount ELSE computer + :amount END WHERE username = :user")
  void buyComputer(@Param("user") String user, @Param("amount") Integer amount);
}
