package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "visitors")
public class VisitorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // getters & setters
}
