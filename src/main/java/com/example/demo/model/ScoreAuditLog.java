package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "score_audit_logs")
@Data
public class ScoreAuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long visitorId;
    private String riskLevel;
    private LocalDateTime timestamp = LocalDateTime.now();
}
