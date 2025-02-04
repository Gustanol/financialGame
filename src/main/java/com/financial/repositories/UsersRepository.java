package com.financial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.financial.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
  
}
