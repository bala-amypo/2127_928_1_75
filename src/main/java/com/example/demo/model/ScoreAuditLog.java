package com.example.demo.model;

import lombok.Data;

@Data
public class ScoreAuditLog {
    private Long id;
    private String reason;
    private int scoreChange;
}
