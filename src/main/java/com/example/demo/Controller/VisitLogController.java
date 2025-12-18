package com.example.demo.controller;

import com.example.demo.entity.VisitLogEntity;
import com.example.demo.service.VisitLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visit-logs")
public class VisitLogController {

    private final VisitLogService visitLogService;

    public VisitLogController(VisitLogService visitLogService) {
        this.visitLogService = visitLogService;
    }

    @PostMapping
    public VisitLogEntity createVisitLog(@RequestBody VisitLogEntity visitLog) {
        return visitLogService.createVisitLog(visitLog);
    }

    @GetMapping
    public List<VisitLogEntity> getAllVisitLogs() {
        return visitLogService.getAllVisitLogs();
    }

    @GetMapping("/visitor/{visitorId}")
    public List<VisitLogEntity> getLogsByVisitor(@PathVariable Long visitorId) {
        return visitLogService.getLogsByVisitorId(visitorId);
    }
}
