package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class ScoreAuditLogModel {
    private Long id;
    private Long visitLogId;
    private int oldScore;
    private int newScore;
    private LocalDateTime auditTime;
}
