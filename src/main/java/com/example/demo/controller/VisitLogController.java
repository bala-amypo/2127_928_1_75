package com.example.demo.controller;

import com.example.demo.model.VisitLog;
import com.example.demo.service.VisitLogService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visit-logs")
public class VisitLogController {

    private final VisitLogService visitLogService;

    public VisitLogController(VisitLogService visitLogService) {
        this.visitLogService = visitLogService;
    }

    @PostMapping("/{userId}")
    public VisitLog createVisitLog(
            @PathVariable Long userId,
            @RequestBody VisitLog log) {

        return visitLogService.createVisitLog(userId, log);
    }
}
