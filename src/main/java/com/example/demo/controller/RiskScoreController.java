package com.example.demo.controller;

import com.example.demo.model.RiskScore;
import com.example.demo.service.RiskScoreService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risk-score")
public class RiskScoreController {

    private final RiskScoreService riskScoreService;

    public RiskScoreController(RiskScoreService riskScoreService) {
        this.riskScoreService = riskScoreService;
    }

    @GetMapping("/{visitorId}")
    public RiskScore evaluate(@PathVariable long visitorId) {
        return riskScoreService.evaluateVisitor(visitorId);
    }
}
