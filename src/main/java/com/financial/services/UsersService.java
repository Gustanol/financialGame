package com.financial.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.financial.repositories.UsersRepository;
import com.financial.repositories.PurchaseRepository;
import com.financial.dto.UsersDTO;
import com.financial.entities.Users;

@Service
public class UsersService {
  
  @Autowired
  private UsersRepository usersRepository;
  
  @Autowired
  private PurchaseRepository purchaseRepository;
  
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
  
  @Transactional(readOnly = true)
  public Users createUser(String name) {
    Users users = new Users();
    users.setName(name);
    users.setCash(10000.0);
    purchaseRepository.addUser(name);
    return usersRepository.save(users);
  }
  
  @Transactional(readOnly = true)
  public void lendMoney(Double amount, String fromUser, String toUser) {
    usersRepository.withdrawMoney(amount, fromUser);
    usersRepository.depositMoney(amount, toUser);
  }
  
  @Transactional(readOnly = true)
  public Double verifyMoney(String fromUser) {
    Double cash = usersRepository.verifyMoney(fromUser);
    return cash;
  }
  
  @Transactional(readOnly = true)
  public void deleteUser(String name) {
    usersRepository.deleteUser(name);
    purchaseRepository.removeUser(name);
  }
}
