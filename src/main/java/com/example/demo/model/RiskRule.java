package com.example.demo.model;

import lombok.Data;

@Data
public class RiskRule {
    private Long id;
    private String ruleName;
    private int score;  // needed for RiskScore calculation
}
