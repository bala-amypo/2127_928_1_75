package com.example.demo.service;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.RegisterRequest;

public interface UserService {

    Object login(AuthRequest request);

    Object register(RegisterRequest request);
}
