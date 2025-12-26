package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.*;

@Data
@No_ARGS_CONSTRUCTOR
@All_ARGS_CONSTRUCTOR
@Builder


public class RiskScore {
    private Long id;
    private String ruleName;
    private int totalScore;
    private Long userId;
}
