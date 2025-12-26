package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ScoreAuditLogModel;
import com.example.demo.service.ScoreAuditLogService;

@RestController
@RequestMapping("/api/score-audit")
public class ScoreAuditLogController {

    private final ScoreAuditLogService scoreAuditLogService;

    public ScoreAuditLogController(ScoreAuditLogService scoreAuditLogService) {
        this.scoreAuditLogService = scoreAuditLogService;
    }

    @PostMapping
    public ScoreAuditLogModel saveAudit(@RequestBody ScoreAuditLogModel audit) {
        return scoreAuditLogService.saveAudit(audit);
    }
}
