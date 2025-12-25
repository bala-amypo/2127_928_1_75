package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "score_audit_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScoreAuditLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long visitId;

    @Column(nullable = false)
    private Integer oldScore;

    @Column(nullable = false)
    private Integer newScore;

    @Column(nullable = false)
    private LocalDateTime changedAt;
}
