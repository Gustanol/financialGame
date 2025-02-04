package com.financial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PathVariable;

import com.financial.services.UsersService;
import com.financial.dto.UsersDTO;

@RestController
@RequestMapping(value = "/users")
public class UsersController {
  
  @Autowired
  private UsersService usersService;
  
  @GetMapping(value = "/{id}")
  public UsersDTO findById(@PathVariable Long id) {
    UsersDTO result = usersService.findById(id);
    return result;
  }
}
