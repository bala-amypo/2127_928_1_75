package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.*;

@Data
@No_ARGS_CONSTRUCTOR
@All_ARGS_CONSTRUCTOR
@Builder


public class AuthResponse {
    private String token;
}
