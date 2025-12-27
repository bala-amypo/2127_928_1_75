package com.example.demo.service.impl;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public AuthResponse login(AuthRequest request) {

        // TEMP logic – replace with real auth later
        return AuthResponse.builder()
                .token("dummy-jwt-token")
                .build();
    }

    @Override
    public AuthResponse register(RegisterRequest request) {

        return AuthResponse.builder()
                .token("registered-jwt-token")
                .build();
    }
}
