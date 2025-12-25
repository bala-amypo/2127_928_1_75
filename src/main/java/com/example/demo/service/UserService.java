package com.example.demo.service;

import com.example.demo.model.UserModel;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;

    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    // Example method to register user
    public UserModel registerUser(UserModel user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return user; // In real app, save to DB
    }
}
