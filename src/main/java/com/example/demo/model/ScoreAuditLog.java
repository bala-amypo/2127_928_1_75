package com.example.demo.model;

public class ScoreAuditLog {

    private Long id;
    private Long visitorId;
    private Long riskScoreId;
    private String oldValue;
    private String newValue;

    public ScoreAuditLog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Long visitorId) {
        this.visitorId = visitorId;
    }

    public Long getRiskScoreId() {
        return riskScoreId;
    }

    public void setRiskScoreId(Long riskScoreId) {
        this.riskScoreId = riskScoreId;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }
}
