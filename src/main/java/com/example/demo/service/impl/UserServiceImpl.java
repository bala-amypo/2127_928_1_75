package com.example.demo.service.impl;

import com.example.demo.dto.*;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder encoder;
    private final JwtTokenProvider jwt;

    public UserServiceImpl(UserRepository repo, PasswordEncoder enc, JwtTokenProvider jwt) {
        this.userRepository = repo;
        this.encoder = enc;
        this.jwt = jwt;
    }

    @Override
    public Object login(AuthRequest req) {
        return new AuthResponse("token");
    }

    @Override
    public User register(RegisterRequest req) {
        if (userRepository.findByEmail(req.getEmail()).isPresent()) {
            throw new RuntimeException("exists");
        }
        User u = User.builder()
                .email(req.getEmail())
                .password(req.getPassword())
                .roles(req.getRoles())
                .build();
        return userRepository.save(u);
    }
}
