package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RiskScoreModel {
    private Long id;
    private Long visitorId;
    private int totalScore;
}
