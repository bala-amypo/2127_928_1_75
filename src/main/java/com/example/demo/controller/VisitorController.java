package com.example.demo.controller;

import com.example.demo.service.VisitorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visitors")
public class VisitorController {

    private final VisitorService visitorService;

    public VisitorController(VisitorService visitorService) {
        this.visitorService = visitorService;
    }

    @PostMapping
    public ResponseEntity<Long> addVisitor(@RequestParam String name) {
        return ResponseEntity.ok(visitorService.addVisitor(name));
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getVisitor(@PathVariable Long id) {
        return ResponseEntity.ok(visitorService.getVisitor(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateVisitor(@PathVariable Long id, @RequestParam String name) {
        visitorService.updateVisitor(id, name);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVisitor(@PathVariable Long id) {
        visitorService.deleteVisitor(id);
        return ResponseEntity.ok().build();
    }
}
