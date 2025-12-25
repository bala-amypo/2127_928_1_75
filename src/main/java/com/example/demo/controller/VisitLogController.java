package com.example.demo.controller;

import com.example.demo.entity.VisitLogEntity;
import com.example.demo.service.VisitLogService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visits")
public class VisitLogController {

    private final VisitLogService visitLogService;

    public VisitLogController(VisitLogService visitLogService) {
        this.visitLogService = visitLogService;
    }

    @PostMapping("/{visitorId}")
    public VisitLogEntity createVisit(
            @PathVariable Long visitorId,
            @RequestBody VisitLogEntity visitLog) {

        return visitLogService.createVisitLog(visitorId, visitLog);
    }
}
