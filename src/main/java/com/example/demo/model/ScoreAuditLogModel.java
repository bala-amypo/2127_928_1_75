package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "score_audit_logs")
public class ScoreAuditLogModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long riskScoreId;
    private String action;
    private LocalDateTime timestamp;

    // getters & setters
}
