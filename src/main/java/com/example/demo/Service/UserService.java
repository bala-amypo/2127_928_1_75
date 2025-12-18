package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.exception.BadRequestException;
import com.example.demo.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    // ✅ Constructor injection (MANDATORY for AmyPO)
    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // ✅ Register user
    public UserEntity register(UserEntity user) {
        if (user.getEmail() != null &&
                userRepository.existsByEmail(user.getEmail())) {
            throw new BadRequestException("Email already exists");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    // ✅ Get all users
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    // ✅ Get user by ID
    public UserEntity getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() ->
                        new BadRequestException("User not found"));
    }

    // ✅ Get user by email
    public Optional<UserEntity> getByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // ✅ Delete user
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new BadRequestException("User not found");
        }
        userRepository.deleteById(id);
    }
}
