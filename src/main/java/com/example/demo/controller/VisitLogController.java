package com.example.demo.controller;

import com.example.demo.model.VisitLogModel;
import com.example.demo.service.VisitLogService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visit-logs")
public class VisitLogController {

    private final VisitLogService service;

    public VisitLogController(VisitLogService service) {
        this.service = service;
    }

    @PostMapping
    public VisitLogModel create(@RequestBody VisitLogModel model) {
        return service.create(model);
    }
}
