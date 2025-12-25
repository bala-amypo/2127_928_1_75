package com.example.demo.service;

import com.example.demo.model.ScoreAuditLogModel;
import com.example.demo.model.RiskScoreModel;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class ScoreAuditLogService {

    // Example method to create audit log
    public ScoreAuditLogModel createAuditLog(RiskScoreModel riskScore, String action) {
        ScoreAuditLogModel auditLog = new ScoreAuditLogModel();
        auditLog.setRiskScoreId(riskScore.getId());
        auditLog.setAction(action);
        auditLog.setTimestamp(LocalDateTime.now());

        return auditLog;
    }
}
