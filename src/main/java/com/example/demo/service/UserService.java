package com.example.demo.service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserModel register(String username, String password) {
        UserModel user = new UserModel();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        return userRepository.save(user);
    }

    public UserModel getByUsername(String username) {
        return userRepository
                .findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
