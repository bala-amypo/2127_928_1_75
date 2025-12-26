package com.example.demo.service.impl;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.stereotype.Service;

@Service
public class ScoreAuditLogServiceImpl implements ScoreAuditLogService {

    @Override
    public ScoreAuditLog logChange(String reason, int change) {
        ScoreAuditLog log = new ScoreAuditLog();
        log.setReason(reason);
        log.setScoreChange(change);
        return log;
    }
}
