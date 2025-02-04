package com.financial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.financial.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
  Users findByName(String name);
}
