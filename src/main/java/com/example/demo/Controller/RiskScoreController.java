package com.example.demo.controller;

import com.example.demo.entity.RiskScoreEntity;
import com.example.demo.entity.VisitorEntity;
import com.example.demo.service.RiskScoreService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risk-scores")
public class RiskScoreController {

    private final RiskScoreService riskScoreService;

    public RiskScoreController(RiskScoreService riskScoreService) {
        this.riskScoreService = riskScoreService;
    }

    @PostMapping("/evaluate")
    public RiskScoreEntity evaluate(@RequestBody VisitorEntity visitor) {
        return riskScoreService.evaluateVisitor(visitor);
    }
}
