package com.financial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.http.ResponseEntity;
// import org.springframework.http.HttpStatus;

import com.financial.services.UsersService;
import com.financial.services.ItemsService;
import com.financial.services.PurchaseService;

@RestController
@RequestMapping(value = "/money")
public class MoneyController {
  
  @Autowired
  private UsersService usersService;
  
  @Autowired
  private ItemsService itemsService;
  
  @Autowired
  private PurchaseService purchaseService;
  
  @PostMapping(value = "/lend")
  public Object lendMoney(@RequestParam(required = true) Double amount, @RequestParam(required = true) String fromUser, @RequestParam(required = true) String toUser) {
    Double cash = usersService.verifyMoney(fromUser);
    if (cash < amount) {
      return "The user '" + fromUser + "' does not have enough money";
    }
    usersService.lendMoney(amount, fromUser, toUser);
    return true;
  }
  
  @PostMapping(value = "/buy/{user}/{item}/{amount}")
    public Object buyItem(@PathVariable String user, @PathVariable String item, @PathVariable Integer amount) {
      Double cash = usersService.verifyMoney(user);
      Double cost = itemsService.itemCost(item);
      if (cost * amount > cash) {
        return "The user '" + user + "' does not have enough money to buy it";
      }
      purchaseService.shopping(user, item, amount);
      return true;
    }
}
