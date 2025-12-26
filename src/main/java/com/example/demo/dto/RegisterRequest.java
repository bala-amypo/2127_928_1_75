package com.example.demo.dto;

import lombok.Data;
import lombok.*;

@Data
@No_ARGS_CONSTRUCTOR
@All_ARGS_CONSTRUCTOR
@Builder



public class RegisterRequest {
    private String email;
    private String password;
    private String roles;
}
