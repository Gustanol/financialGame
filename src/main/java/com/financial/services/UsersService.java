package com.financial.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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
  
  @Transactional(readOnly = true)
  public UsersDTO findByName(String name) {
    Users userName = usersRepository.findByName(name);
    return new UsersDTO(userName);
  }
  
  @Transactional(readOnly = true)
  public List<UsersDTO> findAll() {
    List<Users> users = usersRepository.findAll();
    return users.stream().map(user -> new UsersDTO(user)).toList();
  }
}
