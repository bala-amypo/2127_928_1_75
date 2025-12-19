package com.example.demo.controller;

import com.example.demo.service.RiskScoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risk-scores")
public class RiskScoreController {

    private final RiskScoreService riskScoreService;

    public RiskScoreController(RiskScoreService riskScoreService) {
        this.riskScoreService = riskScoreService;
    }

    @PostMapping
    public ResponseEntity<Long> addScore(@RequestParam String level) {
        return ResponseEntity.ok(riskScoreService.addScore(level));
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getScore(@PathVariable Long id) {
        return ResponseEntity.ok(riskScoreService.getScore(id));
    }
}
