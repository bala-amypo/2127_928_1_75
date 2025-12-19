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
public class RiskScoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Visitor whose risk is evaluated
    @ManyToOne
    private VisitorEntity visitor;

    // Final aggregated score
    private int totalScore;

    // LOW / MEDIUM / HIGH / CRITICAL
    private String riskLevel;

    // Evaluation timestamp
    private LocalDateTime evaluatedAt;

    @PrePersist
    public void onCreate() {
        if (evaluatedAt == null) {
            evaluatedAt = LocalDateTime.now();
        }
    }
}
