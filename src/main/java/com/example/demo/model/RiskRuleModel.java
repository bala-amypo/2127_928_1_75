package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RiskRuleModel {
    private Long id;
    private String ruleName;
    private int scoreImpact;

    // Example method if used in service
    public int getScoreImpact() {
        return scoreImpact;
    }
}
