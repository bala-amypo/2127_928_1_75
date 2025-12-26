package com.example.demo.service.impl;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service   // 🔥 THIS WAS MISSING OR INCORRECT
public class UserServiceImpl implements UserService {

    private final JwtTokenProvider jwtTokenProvider;

    public UserServiceImpl(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public AuthResponse login(AuthRequest request) {
        String token = jwtTokenProvider.createToken(request.getUsername());
        return new AuthResponse(token);
    }

    @Override
    public AuthResponse register(RegisterRequest request) {
        String token = jwtTokenProvider.createToken(request.getUsername());
        return new AuthResponse(token);
    }
}
