package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "score_audit_logs")
public class ScoreAuditLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;

    private String riskLevel;
    private String reason;

    // ===== GETTERS =====
    public Long getId() {
        return id;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public String getReason() {
        return reason;
    }

    // ===== SETTERS =====
    public void setId(Long id) {
        this.id = id;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
