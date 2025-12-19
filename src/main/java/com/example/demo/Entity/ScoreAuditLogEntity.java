package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScoreAuditLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Visitor for whom rule was applied
    @ManyToOne
    private VisitorEntity visitor;

    // Applied risk rule
    @ManyToOne
    private RiskRuleEntity appliedRule;

    // Score added by rule
    private int scoreChange;

    // Reason / rule name
    private String reason;

    // Timestamp
    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
