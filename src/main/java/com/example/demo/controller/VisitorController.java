package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Visitor")
@RestController
@RequestMapping("/visitors")
public class VisitorController {
    private final VisitorService service;
    public VisitorController(VisitorService s){ this.service=s; }

    @PostMapping public ResponseEntity<Visitor> create(@RequestBody Visitor v){ return ResponseEntity.ok(service.createVisitor(v)); }
    @GetMapping("/{id}") public ResponseEntity<Visitor> get(@PathVariable Long id){ return ResponseEntity.ok(service.getVisitor(id)); }
    @GetMapping public ResponseEntity<List<Visitor>> all(){ return ResponseEntity.ok(service.getAllVisitors()); }
}
