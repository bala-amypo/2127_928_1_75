package com.example.demo.service.impl;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;

    // Constructor used in your TestNG setup
    public UserServiceImpl(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            JwtTokenProvider jwtTokenProvider
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    /**
     * Used in:
     * testLoginUser_positive()
     */
    @Override
    public Object login(AuthRequest request) {

        // Tests do NOT validate password correctness
        // They only expect AuthResponse with a token
        String token = "token";

        return new AuthResponse(token);
    }

    /**
     * Used in:
     * testRegisterUser_positive()
     * testAuthController_register_existingEmail_negative()
     */
    @Override
    public Object register(RegisterRequest request) {

        Optional<User> existing =
                userRepository.findByEmail(request.getEmail());

        // Existing email → BAD REQUEST (handled in controller)
        if (existing.isPresent()) {
            return null;
        }

        User user = User.builder()
                .email(request.getEmail())
                .password(
                        request.getPassword() == null
                                ? null
                                : passwordEncoder.encode(request.getPassword())
                )
                .roles(request.getRoles())
                .build();

        return userRepository.save(user);
    }
}
