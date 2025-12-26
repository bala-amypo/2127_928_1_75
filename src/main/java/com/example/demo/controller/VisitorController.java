package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.VisitorModel;
import com.example.demo.service.VisitorService;

@RestController
@RequestMapping("/api/visitors")
public class VisitorController {

    private final VisitorService visitorService;

    public VisitorController(VisitorService visitorService) {
        this.visitorService = visitorService;
    }

    @PostMapping
    public VisitorModel createVisitor(@RequestBody VisitorModel visitor) {
        return visitorService.createVisitor(visitor);
    }
}
