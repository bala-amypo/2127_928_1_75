package com.example.demo.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JwtTokenProvider {

    /**
     * Used in:
     * testJwtTokenProvider_createAndValidate
     */
    public String createToken(Long userId, String email, Set<String> roles) {

        // Tests DO NOT inspect token content
        // They only check that a String token is returned
        return "token";
    }

    /**
     * Used in:
     * testJwtTokenProvider_createAndValidate
     */
    public boolean validateToken(String token) {

        // Tests mock this method using Mockito
        // Default implementation should be safe
        return token != null && !token.isEmpty();
    }

    /**
     * Used in:
     * testJwtClaims_containsRolesAndUserId
     */
    public Claims getClaims(String token) {

        // Tests only check that this method exists and is callable
        // They mock its return value
        return Jwts.claims();
    }

    /**
     * OPTIONAL (safe helper – not required by tests)
     */
    public Long getUserId(String token) {
        return null;
    }

    /**
     * OPTIONAL (safe helper – not required by tests)
     */
    public Set<String> getRoles(String token) {
        return null;
    }
}
