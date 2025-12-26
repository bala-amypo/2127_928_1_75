package com.example.demo.service.impl;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User register(RegisterRequest request) {
        // In real project, you would save user to DB
        // Here we just create a new user and return

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword()); // In real app, encode password with BCrypt

        // Return the created user
        return user;
    }
}
