package com.example.demo.controller;

import com.example.demo.entity.ScoreAuditLogEntity;
import com.example.demo.repository.ScoreAuditLogRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/score-audit-logs")
public class ScoreAuditLogController {

    private final ScoreAuditLogRepository scoreAuditLogRepository;

    public ScoreAuditLogController(ScoreAuditLogRepository scoreAuditLogRepository) {
        this.scoreAuditLogRepository = scoreAuditLogRepository;
    }

    @GetMapping("/visit/{visitId}")
    public List<ScoreAuditLogEntity> getLogsByVisitId(@PathVariable Long visitId) {
        return scoreAuditLogRepository.findByVisitId(visitId);
    }
}
