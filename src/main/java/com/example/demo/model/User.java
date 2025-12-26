package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.*;

@Data
@No_ARGS_CONSTRUCTOR
@All_ARGS_CONSTRUCTOR
@Builder



public class User {
    private Long id;
    private String email;
    private String password;
    private String roles; // or List<String> if you prefer
}
