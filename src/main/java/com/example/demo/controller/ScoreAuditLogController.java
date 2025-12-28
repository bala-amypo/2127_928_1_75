package com.example.demo.controller;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/audit-logs")
public class ScoreAuditLogController {

    private final ScoreAuditLogService auditLogService;

    public ScoreAuditLogController(ScoreAuditLogService auditLogService) {
        this.auditLogService = auditLogService;
    }

    @PostMapping("/{visitorId}/{riskScoreId}")
    public void logScoreChange(@PathVariable Long visitorId,
                               @PathVariable Long riskScoreId,
                               @RequestBody ScoreAuditLog log) {
        auditLogService.logScoreChange(visitorId, riskScoreId, log);
    }

    @GetMapping("/{logId}")
    public ScoreAuditLog getLog(@PathVariable Long logId) {
        return auditLogService.getLog(logId);
    }

    @GetMapping("/visitor/{visitorId}")
    public List<ScoreAuditLog> getLogsByVisitor(@PathVariable Long visitorId) {
        return auditLogService.getLogsByVisitor(visitorId);
    }
}
