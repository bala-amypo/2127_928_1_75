package com.example.demo.controller;

import com.example.demo.model.ScoreAuditLog;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/score-audit")
public class ScoreAuditLogController {

    @PostMapping("/{visitorId}/{score}")
    public ScoreAuditLog create(@PathVariable long visitorId,
                                @PathVariable long score,
                                @RequestBody ScoreAuditLog log) {
        log.setVisitorId(visitorId);
        return log;
    }

    @GetMapping("/{id}")
    public ScoreAuditLog get(@PathVariable long id) {
        return ScoreAuditLog.builder().id(id).reason("TEST").build();
    }

    @GetMapping("/visitor/{visitorId}")
    public List<ScoreAuditLog> logsByVisitor(@PathVariable long visitorId) {
        return new ArrayList<>();
    }
}
