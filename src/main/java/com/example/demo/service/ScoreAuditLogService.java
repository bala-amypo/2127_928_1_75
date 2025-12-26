package com.example.demo.service;

import com.example.demo.model.ScoreAuditLog;

import java.util.List;

public interface ScoreAuditLogService {

    ScoreAuditLog save(ScoreAuditLog log);

    ScoreAuditLog getLog(Long id);

    List<ScoreAuditLog> getLogsByVisitor(Long userId);

    // ✅ REQUIRED BY CONTROLLER
    ScoreAuditLog logScoreChange(Long userId, Long scoreId, ScoreAuditLog log);
}
