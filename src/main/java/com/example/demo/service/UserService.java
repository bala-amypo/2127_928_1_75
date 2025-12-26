package com.example.demo.service;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.model.User;

public interface UserService {

    User register(RegisterRequest request);
    // You can add more methods like login(), findByUsername() etc.
}
