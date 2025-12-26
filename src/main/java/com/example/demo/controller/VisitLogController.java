package com.example.demo.controller;

import com.example.demo.model.VisitLog;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/visit-logs")
public class VisitLogController {

    @PostMapping("/{visitorId}")
    public VisitLog create(@PathVariable long visitorId,
                           @RequestBody VisitLog log) {
        log.setVisitorId(visitorId);
        return log;
    }

    @GetMapping("/{id}")
    public VisitLog get(@PathVariable long id) {
        return VisitLog.builder().id(id).purpose("TEST").build();
    }

    @GetMapping("/visitor/{visitorId}")
    public List<VisitLog> listByVisitor(@PathVariable long visitorId) {
        return new ArrayList<>();
    }
}
