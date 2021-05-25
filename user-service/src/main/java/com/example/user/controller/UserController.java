package com.example.user.controller;

import com.example.user.entity.User;
import com.example.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/create/")
    public User saveUser(@RequestBody User user)
    {
        log.info("UserController saveUser: " + user);
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User findByUserByUserId(@PathVariable("id") Long userId)
    {
        log.info("UserController findByUserByUserId: " + userId);
        return userService.findByUserId(userId);
    }
}
