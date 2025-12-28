package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "score_audit_logs")
public class ScoreAuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long visitorId;
    private String oldRiskLevel;
    private String newRiskLevel;
    private LocalDateTime changedAt;
}
