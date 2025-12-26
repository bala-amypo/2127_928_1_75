package com.example.demo.controller;

import com.example.demo.service.RiskRuleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risk-rules")
public class RiskRuleController {

    private final RiskRuleService riskRuleService;

    public RiskRuleController(RiskRuleService riskRuleService) {
        this.riskRuleService = riskRuleService;
    }

    @GetMapping("/{key}")
    public ResponseEntity<String> getRiskLevel(@PathVariable String key) {
        return ResponseEntity.ok(riskRuleService.getRiskLevel(key));
    }

    @PutMapping("/{key}")
    public ResponseEntity<String> updateRiskLevel(@PathVariable String key,
                                                  @RequestParam String level) {
        riskRuleService.setRiskLevel(key, level);
        return ResponseEntity.ok("Risk level updated for key: " + key);
    }

    @DeleteMapping("/{key}")
    public ResponseEntity<String> deleteRiskLevel(@PathVariable String key) {
        riskRuleService.deleteRiskRule(key);
        return ResponseEntity.status(HttpStatus.NO_CONTENT)
                             .body("Risk rule deleted for key: " + key);
    }
}
