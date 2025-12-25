package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserModel {
    private Long id;
    private String username;
    private String password; // For PasswordEncoder
    private String role;
}
