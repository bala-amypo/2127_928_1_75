package com.example.demo.controller;

import com.example.demo.model.VisitLogModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/visit-logs")
public class VisitLogController {

    private final List<VisitLogModel> visitLogs = new ArrayList<>();

    @PostMapping
    public VisitLogModel create(@RequestBody VisitLogModel log) {
        visitLogs.add(log);
        return log;
    }

    @GetMapping
    public List<VisitLogModel> getAll() {
        return visitLogs;
    }
}
