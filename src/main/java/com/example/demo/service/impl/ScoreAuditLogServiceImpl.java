package com.example.demo.service.impl;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.model.Visitor;
import com.example.demo.repository.ScoreAuditLogRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreAuditLogServiceImpl implements ScoreAuditLogService {

    private final ScoreAuditLogRepository auditLogRepository;
    private final VisitorRepository visitorRepository;

    public ScoreAuditLogServiceImpl(ScoreAuditLogRepository auditLogRepository,
                                    VisitorRepository visitorRepository) {
        this.auditLogRepository = auditLogRepository;
        this.visitorRepository = visitorRepository;
    }

    @Override
    public ScoreAuditLog logScoreChange(Long visitorId, Long riskScoreId, ScoreAuditLog log) {
        Visitor visitor = visitorRepository.findById(visitorId)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));
        log.setVisitor(visitor);
        log.setRiskScoreId(riskScoreId);
        return auditLogRepository.save(log);
    }

    @Override
    public ScoreAuditLog getLog(Long id) {
        return auditLogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ScoreAuditLog not found"));
    }

    @Override
    public List<ScoreAuditLog> getLogsByVisitor(Long visitorId) {
        Visitor visitor = visitorRepository.findById(visitorId)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));
        return auditLogRepository.findByVisitor(visitor);
    }
}
