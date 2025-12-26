package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    public String createToken(String username) {
        return "dummy-token-for-" + username;
    }
}
