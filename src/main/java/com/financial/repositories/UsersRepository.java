package com.financial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.financial.entities.Users;
public interface UsersRepository extends JpaRepository<Users, Long> {
  
  Users findByName(String name);
  
  @Modifying
  @Transactional
  @Query(nativeQuery = true, value = "UPDATE users SET cash = cash - :amount WHERE name = :fromUser")
  void withdrawMoney(@Param("amount") Double amount, @Param("fromUser") String fromUser);

  @Modifying
  @Transactional
  @Query(nativeQuery = true, value = "UPDATE users SET cash = cash + :amount WHERE name = :toUser")
  void depositMoney(@Param("amount") Double amount, @Param("toUser") String toUser);
}

