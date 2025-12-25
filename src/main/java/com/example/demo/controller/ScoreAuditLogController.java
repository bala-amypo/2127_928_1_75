package com.example.demo.controller;

import com.example.demo.model.ScoreAuditLogModel;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/audit-logs")
public class ScoreAuditLogController {

    private final ScoreAuditLogService service;

    public ScoreAuditLogController(ScoreAuditLogService service) {
        this.service = service;
    }

    @GetMapping
    public List<ScoreAuditLogModel> getAll() {
        return service.getAll();
    }
}
