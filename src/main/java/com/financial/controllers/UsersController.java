package com.financial.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.financial.services.UsersService;
import com.financial.dto.UsersDTO;
import com.financial.entities.Users;

@RestController
@RequestMapping(value = "/users")
public class UsersController {
  
  @Autowired
  private UsersService usersService;
  
  @GetMapping
  public Object findUsers(@RequestParam(required = false) String name) {
    if (name != null) {
      return usersService.findByName(name);
    }
    return usersService.findAll();
  }
  
  @GetMapping(value = "/{id}")
  public UsersDTO findById(@PathVariable Long id) {
    UsersDTO result = usersService.findById(id);
    return result;
  }
  
  @PostMapping(value = "/create/{name}")
  public ResponseEntity<Users> createUser(@PathVariable String name) {
    Users createdUser = usersService.createUser(name);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
  }
}
