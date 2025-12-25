package com.example.demo.service;

import com.example.demo.model.ScoreAuditLogModel;
import com.example.demo.model.VisitLogModel;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ScoreAuditLogService {

    public ScoreAuditLogModel createAuditLog(VisitLogModel visitLog, int oldScore, int newScore) {
        return ScoreAuditLogModel.builder()
                .visitLogId(visitLog.getId())
                .oldScore(oldScore)
                .newScore(newScore)
                .auditTime(LocalDateTime.now())
                .build();
    }
}
