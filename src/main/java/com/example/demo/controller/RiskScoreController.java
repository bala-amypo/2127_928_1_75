package com.example.demo.controller;

import com.example.demo.model.RiskScore;
import com.example.demo.service.RiskScoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/risk-scores")
public class RiskScoreController {

    private final RiskScoreService riskScoreService;

    public RiskScoreController(RiskScoreService riskScoreService) {
        this.riskScoreService = riskScoreService;
    }

    @PostMapping("/evaluate/{visitorId}")
    public ResponseEntity<RiskScore> evaluate(@PathVariable Long visitorId) {
        return ResponseEntity.ok(riskScoreService.evaluateVisitor(visitorId));
    }

    @GetMapping("/{visitorId}")
    public ResponseEntity<RiskScore> getScore(@PathVariable Long visitorId) {
        return ResponseEntity.ok(riskScoreService.getScoreForVisitor(visitorId));
    }

    @GetMapping
    public ResponseEntity<List<RiskScore>> getAllScores() {
        return ResponseEntity.ok(riskScoreService.getAllScores());
    }
}
