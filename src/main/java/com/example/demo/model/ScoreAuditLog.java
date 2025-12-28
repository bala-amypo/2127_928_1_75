package com.example.demo.model;

public class ScoreAuditLog {
    private Long id;
    private Long visitorId;
    private String riskLevel;

    public ScoreAuditLog() {}

    public ScoreAuditLog(Long id, Long visitorId, String riskLevel) {
        this.id = id;
        this.visitorId = visitorId;
        this.riskLevel = riskLevel;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getVisitorId() { return visitorId; }
    public void setVisitorId(Long visitorId) { this.visitorId = visitorId; }

    public String getRiskLevel() { return riskLevel; }
    public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }
}
