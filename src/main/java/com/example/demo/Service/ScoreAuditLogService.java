package com.example.demo.service;

import com.example.demo.entity.ScoreAuditLogEntity;
import com.example.demo.repository.ScoreAuditLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreAuditLogService {

    private final ScoreAuditLogRepository scoreAuditLogRepository;

    // ✅ Constructor Injection (MANDATORY)
    public ScoreAuditLogService(ScoreAuditLogRepository scoreAuditLogRepository) {
        this.scoreAuditLogRepository = scoreAuditLogRepository;
    }

    // ✅ Fetch all audit logs
    public List<ScoreAuditLogEntity> getAllLogs() {
        return scoreAuditLogRepository.findAll();
    }

    // ✅ Fetch audit logs by visitor
    public List<ScoreAuditLogEntity> getLogsByVisitor(Long visitorId) {
        return scoreAuditLogRepository.findByVisitorId(visitorId);
    }
}
