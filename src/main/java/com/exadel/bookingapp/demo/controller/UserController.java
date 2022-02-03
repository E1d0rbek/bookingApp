package com.exadel.bookingapp.demo.controller;

import com.exadel.bookingapp.demo.entity.User;
import com.exadel.bookingapp.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get")
    private Iterable<User> getAllBooks()
    {
        return userService.getAllUser();
    }

    @PostMapping("/add")

    public User saveUser(
             @RequestBody User user)
    {
        return userService.saveUser(user);
    }
}
