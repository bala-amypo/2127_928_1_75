package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "risk_scores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RiskScoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long visitId;

    @Column(nullable = false)
    private Integer score;

    @Column(nullable = false)
    private String riskLevel;
}
