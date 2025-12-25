package com.example.demo.controller;

import com.example.demo.model.RiskScoreModel;
import com.example.demo.service.RiskScoreService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risk-scores")
public class RiskScoreController {

    private final RiskScoreService service;

    public RiskScoreController(RiskScoreService service) {
        this.service = service;
    }

    @PostMapping("/{visitLogId}")
    public RiskScoreModel calculate(@PathVariable Long visitLogId) {
        return service.calculateRiskScore(visitLogId);
    }
}
