package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            // Disable CSRF for APIs & Swagger
            .csrf(csrf -> csrf.disable())

            // Authorization rules
            .authorizeHttpRequests(auth -> auth
                // Swagger URLs
                .requestMatchers(
                    "/swagger-ui/**",
                    "/swagger-ui.html",
                    "/v3/api-docs/**"
                ).permitAll()

                // Login & public endpoints
                .requestMatchers(
                    "/login",
                    "/error"
                ).permitAll()

                // Everything else requires authentication
                .anyRequest().authenticated()
            )

            // Enable form login
            .formLogin(Customizer.withDefaults())

            // Enable logout
            .logout(Customizer.withDefaults());

        return http.build();
    }
}
