package com.example.demo.service;

import com.example.demo.entity.ScoreAuditLogEntity;
import com.example.demo.repository.ScoreAuditLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreAuditLogService {

    private final ScoreAuditLogRepository scoreAuditLogRepository;

    public ScoreAuditLogService(ScoreAuditLogRepository scoreAuditLogRepository) {
        this.scoreAuditLogRepository = scoreAuditLogRepository;
    }

    public List<ScoreAuditLogEntity> getAllLogs() {
        return scoreAuditLogRepository.findAll();
    }

    public List<ScoreAuditLogEntity> getLogsByVisitor(Long visitorId) {
        return scoreAuditLogRepository.findByVisitorId(visitorId);
    }
}
