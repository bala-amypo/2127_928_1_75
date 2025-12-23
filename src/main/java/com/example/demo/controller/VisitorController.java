package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    // POST
    @PostMapping
    public ResponseEntity<Visitor> create(@Valid @RequestBody Visitor visitor) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.save(visitor));
    }

    // GET
    @GetMapping("/{id}")
    public ResponseEntity<Visitor> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    // PUT
    @PutMapping("/{id}")
    public ResponseEntity<Visitor> update(
            @PathVariable Long id,
            @Valid @RequestBody Visitor visitor) {

        return ResponseEntity.ok(service.update(id, visitor));
    }
}
