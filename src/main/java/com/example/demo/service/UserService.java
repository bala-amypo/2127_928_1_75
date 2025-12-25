package com.example.demo.service;

import com.example.demo.model.UserModel;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final Map<String, UserModel> users = new HashMap<>();

    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public UserModel register(UserModel user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        users.put(user.getUsername(), user);
        return user;
    }

    public boolean authenticate(String username, String password) {
        UserModel user = users.get(username);
        return user != null && passwordEncoder.matches(password, user.getPassword());
    }
}
