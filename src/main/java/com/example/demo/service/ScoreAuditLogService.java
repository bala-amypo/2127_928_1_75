package com.example.demo.service;

import com.example.demo.model.ScoreAuditLog;

import java.util.List;

public interface ScoreAuditLogService {

    ScoreAuditLog create(Long visitorId, Long scoreId, int scoreChange, String reason);

    List<ScoreAuditLog> getByVisitor(Long visitorId);
}
