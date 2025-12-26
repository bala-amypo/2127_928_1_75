package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    public String createToken(String username) {
        // Dummy token for compilation/testing
        return "token-for-" + username;
    }
}
