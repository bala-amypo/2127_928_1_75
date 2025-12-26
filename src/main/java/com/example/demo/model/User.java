package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Long id;
    private String email;
    private String password;
    private String roles; // or List<String> if you prefer
}
