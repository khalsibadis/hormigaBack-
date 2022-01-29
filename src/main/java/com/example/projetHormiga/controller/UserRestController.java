package com.example.projetHormiga.controller;

import com.example.projetHormiga.entities.Facture;
import com.example.projetHormiga.entities.User;
import com.example.projetHormiga.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("User")
public class UserRestController {
    @Autowired
    UserService userService;

    @GetMapping("/List/{id}")
    @ResponseBody
    public List<Facture> FACTURE_LIST(@PathVariable("id") Long Id) {
     return    userService.FACTURE_LIST(Id);
    }
    @PostMapping("addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
    @GetMapping("/ListUser")
    @ResponseBody
    public List<User> LIST_User(){
        return userService.LIST_User();
    }
}
