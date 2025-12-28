package com.example.demo.service;

import com.example.demo.model.ScoreAuditLog;
import java.util.List;

public interface ScoreAuditLogService {
    void logScoreChange(Long visitorId, Long riskScoreId, ScoreAuditLog log);
    ScoreAuditLog getLog(Long logId);
    List<ScoreAuditLog> getLogsByVisitor(Long visitorId);
}
