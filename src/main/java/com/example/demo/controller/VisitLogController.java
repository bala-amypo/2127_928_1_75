package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.VisitLogModel;
import com.example.demo.service.VisitLogService;

@RestController
@RequestMapping("/api/visit-logs")
public class VisitLogController {

    private final VisitLogService visitLogService;

    public VisitLogController(VisitLogService visitLogService) {
        this.visitLogService = visitLogService;
    }

    @PostMapping
    public VisitLogModel logVisit(@RequestBody VisitLogModel visitLog) {
        return visitLogService.logVisit(visitLog);
    }
}
