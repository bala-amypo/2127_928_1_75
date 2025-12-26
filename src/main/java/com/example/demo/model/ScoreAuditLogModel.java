package com.example.demo.model;

import java.time.LocalDateTime;

public class ScoreAuditLogModel {

    private Long id;
    private Long riskScoreId;
    private String message;
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRiskScoreId() {
        return riskScoreId;
    }

    public void setRiskScoreId(Long riskScoreId) {
        this.riskScoreId = riskScoreId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
