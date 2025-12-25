package com.example.demo.controller;

import com.example.demo.model.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final List<UserModel> users = new ArrayList<>();

    @PostMapping
    public UserModel register(@RequestBody UserModel user) {
        users.add(user);
        return user;
    }

    @GetMapping
    public List<UserModel> getAll() {
        return users;
    }
}
