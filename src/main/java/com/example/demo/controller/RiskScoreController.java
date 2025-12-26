package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.RiskScoreModel;
import com.example.demo.service.RiskScoreService;

@RestController
@RequestMapping("/api/risk-scores")
public class RiskScoreController {

    private final RiskScoreService riskScoreService;

    public RiskScoreController(RiskScoreService riskScoreService) {
        this.riskScoreService = riskScoreService;
    }

    @PostMapping
    public RiskScoreModel saveScore(@RequestBody RiskScoreModel score) {
        return riskScoreService.saveScore(score);
    }
}
