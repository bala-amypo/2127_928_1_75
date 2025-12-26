package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RiskScore {
    private Long id;
    private String ruleName;
    private int totalScore;
    private Long userId;
}
