package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Object register(Object request) {
        return request;
    }

    @Override
    public Object login(Object request) {
        return request;
    }
}
