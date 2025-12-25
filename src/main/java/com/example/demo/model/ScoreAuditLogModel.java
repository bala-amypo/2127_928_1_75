package com.example.demo.model;

import java.time.LocalDateTime;

public class ScoreAuditLogModel {
    private Long id;
    private Long riskScoreId;
    private String action;
    private LocalDateTime timestamp;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getRiskScoreId() { return riskScoreId; }
    public void setRiskScoreId(Long riskScoreId) { this.riskScoreId = riskScoreId; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
