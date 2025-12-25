package com.example.demo.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScoreAuditLogModel {
    private Long id;
    private String username;
    private int oldScore;
    private int newScore;
    private LocalDateTime timestamp;
}
