package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "risk_rules")
public class RiskRuleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleName;
    private int score;

    // getters & setters
}
