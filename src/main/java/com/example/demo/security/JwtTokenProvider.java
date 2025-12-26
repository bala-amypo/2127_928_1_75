package com.example.demo.security;

import io.jsonwebtoken.Claims;

import java.util.Set;

public class JwtTokenProvider {

    public String createToken(Long userId, String email, Set<String> roles) {
        return "token";
    }

    public boolean validateToken(String token) {
        return true;
    }

    public Claims getClaims(String token) {
        return io.jsonwebtoken.Jwts.claims();
    }
}
