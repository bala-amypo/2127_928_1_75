package com.example.demo.controller;

import com.example.demo.entity.VisitorEntity;
import com.example.demo.service.VisitorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visitors")
public class VisitorController {

    private final VisitorService visitorService;

    public VisitorController(VisitorService visitorService) {
        this.visitorService = visitorService;
    }

    @PostMapping
    public VisitorEntity createVisitor(@RequestBody VisitorEntity visitor) {
        return visitorService.createVisitor(visitor);
    }

    @GetMapping("/{id}")
    public VisitorEntity getVisitor(@PathVariable Long id) {
        return visitorService.getVisitorById(id);
    }
}
