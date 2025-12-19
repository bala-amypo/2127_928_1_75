package com.example.demo.controller;

import com.example.demo.entity.VisitorEntity;
import com.example.demo.service.VisitorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<VisitorEntity> getAllVisitors() {
        return visitorService.getAllVisitors();
    }

    @GetMapping("/{id}")
    public VisitorEntity getVisitorById(@PathVariable Long id) {
        return visitorService.getVisitorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteVisitor(@PathVariable Long id) {
        visitorService.deleteVisitor(id);
    }
}
