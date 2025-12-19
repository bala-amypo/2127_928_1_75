package com.example.demo.controller;

import com.example.demo.entity.ScoreAuditLogEntity;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/score-audit-logs")
public class ScoreAuditLogController {

    private final ScoreAuditLogService scoreAuditLogService;

    public ScoreAuditLogController(ScoreAuditLogService scoreAuditLogService) {
        this.scoreAuditLogService = scoreAuditLogService;
    }

    @GetMapping
    public List<ScoreAuditLogEntity> getAllLogs() {
        return scoreAuditLogService.getAllLogs();
    }

    @GetMapping("/visitor/{visitorId}")
    public List<ScoreAuditLogEntity> getLogsByVisitor(@PathVariable Long visitorId) {
        return scoreAuditLogService.getLogsByVisitor(visitorId);
    }
}
