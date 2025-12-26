package com.example.demo.service.impl;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;  // <-- Add this import

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;

    public UserServiceImpl(UserRepository userRepository,
                           PasswordEncoder passwordEncoder,
                           JwtTokenProvider jwtTokenProvider) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public Object login(AuthRequest request) {
        // Use createToken instead of generateToken
        String token = jwtTokenProvider.createToken(
                1L,                 // dummy userId; replace with actual user.getId() if needed
                request.getEmail(),
                Set.of("USER")      // dummy role; replace with actual roles if needed
        );
        return new AuthResponse(token);
    }

    @Override
    public Object register(RegisterRequest request) {
        Optional<User> existing = userRepository.findByEmail(request.getEmail());
        if (existing.isPresent()) {
            return null; // Email already exists
        }

        User user = User.builder()
                .email(request.getEmail())
                .password(request.getPassword() == null ? null : passwordEncoder.encode(request.getPassword()))
                .roles(request.getRoles())
                .build();

        return userRepository.save(user);
    }
}
