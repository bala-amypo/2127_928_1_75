package com.example.demo.controller;

import com.example.demo.model.RiskRuleModel;
import com.example.demo.model.RiskScoreModel;
import com.example.demo.model.VisitLogModel;
import com.example.demo.service.RiskRuleService;
import com.example.demo.service.RiskScoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/risk-score")
public class RiskScoreController {

    private final RiskScoreService riskScoreService;
    private final RiskRuleService riskRuleService;

    public RiskScoreController(
            RiskScoreService riskScoreService,
            RiskRuleService riskRuleService) {
        this.riskScoreService = riskScoreService;
        this.riskRuleService = riskRuleService;
    }

    @PostMapping("/calculate")
    public RiskScoreModel calculate(@RequestBody VisitLogModel visitLog) {
        List<RiskRuleModel> rules = riskRuleService.getAll();
        return riskScoreService.calculateRiskScore(visitLog, rules);
    }
}
