package com.example.demo.controller;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/score-audit")
public class ScoreAuditLogController {

    private final ScoreAuditLogService scoreAuditLogService;

    public ScoreAuditLogController(ScoreAuditLogService scoreAuditLogService) {
        this.scoreAuditLogService = scoreAuditLogService;
    }

    @PostMapping("/{userId}/{scoreId}")
    public ScoreAuditLog logScoreChange(
            @PathVariable Long userId,
            @PathVariable Long scoreId,
            @RequestBody ScoreAuditLog log) {

        return scoreAuditLogService.logScoreChange(userId, scoreId, log);
    }
}
