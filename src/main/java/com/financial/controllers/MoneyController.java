package com.financial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.http.ResponseEntity;
// import org.springframework.http.HttpStatus;

import com.financial.services.UsersService;

@RestController
@RequestMapping(value = "/money")
public class MoneyController {
  
  @Autowired
  private UsersService usersService;
  
  @PostMapping(value = "/lend")
  public Object lendMoney(@RequestParam(required = true) Double amount, @RequestParam(required = true) String fromUser, @RequestParam(required = true) String toUser) {
    Double cash = usersService.verifyMoney(fromUser);
    if (cash < amount) {
      return "The user '" + fromUser + "' does not have enough money";
    }
    usersService.lendMoney(amount, fromUser, toUser);
    return true;
  } 
}
