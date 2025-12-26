package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.demo.model.ScoreAuditLogModel;
import com.example.demo.repository.ScoreAuditLogRepository;

@Service
public class ScoreAuditLogService {

    private final ScoreAuditLogRepository scoreAuditLogRepository;

    public ScoreAuditLogService(ScoreAuditLogRepository scoreAuditLogRepository) {
        this.scoreAuditLogRepository = scoreAuditLogRepository;
    }

    public ScoreAuditLogModel saveAudit(ScoreAuditLogModel audit) {
        audit.setCreatedAt(LocalDateTime.now());
        return scoreAuditLogRepository.save(audit);
    }
}
