package com.financial.services;

import org.springframework.stereotype.Service;

import com.financial.repositories.UsersRepository;
import com.financial.dto.UsersDTO;
import com.financial.entities.Users;

@Service
public class UsersService {
  
  @Autowired
  private UsersRepository usersRepository;
  
  @Transactional(readOnly = true)
  public UsersDTO findById(Long id) {
    Users userId = usersRepository.findById(id).get();
    return new UsersDTO(userId);
  }
}
