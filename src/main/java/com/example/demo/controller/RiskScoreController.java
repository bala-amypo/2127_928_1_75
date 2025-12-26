package com.example.demo.controller;

import com.example.demo.model.RiskScoreModel;
import com.example.demo.service.RiskScoreService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/risk-scores")
@Tag(name = "RiskScore")
public class RiskScoreController {

    private final RiskScoreService service;

    public RiskScoreController(RiskScoreService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<RiskScoreModel> create(@RequestBody RiskScoreModel score) {
        return ResponseEntity.ok(service.createScore(score));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RiskScoreModel> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getScore(id));
    }

    @GetMapping
    public ResponseEntity<List<RiskScoreModel>> all() {
        return ResponseEntity.ok(service.getAllScores());
    }
}
