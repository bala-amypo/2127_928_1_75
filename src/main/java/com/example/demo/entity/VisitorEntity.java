package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "visitors")
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotNull
    private Integer age;

    @Email
    private String email;

    @Pattern(regexp = "^[6-9]\\d{9}$")
    private String phone;

    private String purpose;

    // getters and setters
}
