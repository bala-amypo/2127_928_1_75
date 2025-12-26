package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.*;

@Data
@No_ARGS_CONSTRUCTOR
@All_ARGS_CONSTRUCTOR
@Builder

import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest {
    private String email;
    private String password;
}
