package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserModel register(@RequestBody UserModel userModel) {
        return userService.register(userModel);
    }
}
