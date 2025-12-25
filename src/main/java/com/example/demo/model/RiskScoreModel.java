package com.example.demo.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RiskScoreModel {
    private Long id;
    private String username;
    private int score;
}
