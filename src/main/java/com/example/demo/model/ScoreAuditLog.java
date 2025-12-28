package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "score_audit_logs")
public class ScoreAuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long riskScoreId;

    private String action;

    @ManyToOne
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;

    // Add other fields as per your test cases
}
