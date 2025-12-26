package com.example.demo.model;

import lombok.Data;
import lombok.*;

@Data
@No_ARGS_CONSTRUCTOR
@All_ARGS_CONSTRUCTOR
@Builder



public class RiskRule {
    private Long id;
    private String ruleName;
    private int score;  // needed for RiskScore calculation
}
