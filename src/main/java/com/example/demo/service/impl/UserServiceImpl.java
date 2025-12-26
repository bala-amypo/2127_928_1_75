package com.example.demo.service.impl;

import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public AuthResponse login(String email, String password) {
        // minimal dummy implementation
        return new AuthResponse("dummy-token");
    }

    @Override
    public User register(RegisterRequest req) {
        return User.builder()
                .email(req.getEmail())
                .password(req.getPassword())
                .roles(req.getRoles())
                .build();
    }
}
