package com.example.demo.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import com.example.demo.entity.Visitor;
import com.example.demo.service.VisitorService;

@RestController
@RequestMapping("/visitors")
@CrossOrigin(origins = "*")
public class VisitorController {

    private final VisitorService service;

    public VisitorController(VisitorService service) {
        this.service = service;
    }

    // ✅ POST - Create visitor
    @PostMapping
    public ResponseEntity<Visitor> createVisitor(
            @Valid @RequestBody Visitor visitor) {

        Visitor saved = service.saveVisitor(visitor);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // ✅ GET - Fetch visitor by ID
    @GetMapping("/{id}")
    public ResponseEntity<Visitor> getVisitor(@PathVariable Long id) {
        return ResponseEntity.ok(service.getVisitor(id));
    }

    // ✅ PUT - Update visitor
    @PutMapping("/{id}")
    public ResponseEntity<Visitor> updateVisitor(
            @PathVariable Long id,
            @Valid @RequestBody Visitor visitor) {

        return ResponseEntity.ok(service.updateVisitor(id, visitor));
    }
}
