package com.example.demo.service;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.model.User;

public interface UserService {
    Object login(AuthRequest req);
    User register(RegisterRequest req);
}
