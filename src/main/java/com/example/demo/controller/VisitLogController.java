package com.example.demo.controller;

import com.example.demo.service.VisitLogService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Long> logVisit(@RequestParam String details) {
        return ResponseEntity.ok(visitLogService.logVisit(details));
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getVisitLog(@PathVariable Long id) {
        return ResponseEntity.ok(visitLogService.getVisitLog(id));
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllVisitLogs() {
        return ResponseEntity.ok(visitLogService.getAllVisitLogs());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVisitLog(@PathVariable Long id) {
        visitLogService.deleteVisitLog(id);
        return ResponseEntity.ok().build();
    }
}
