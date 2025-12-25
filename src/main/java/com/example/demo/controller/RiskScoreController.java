package com.example.demo.controller;

import com.example.demo.entity.RiskScoreEntity;
import com.example.demo.entity.VisitLogEntity;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.service.RiskScoreService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/risk-score")
public class RiskScoreController {

    private final RiskScoreService riskScoreService;
    private final VisitLogRepository visitLogRepository;

    public RiskScoreController(RiskScoreService riskScoreService,
                               VisitLogRepository visitLogRepository) {
        this.riskScoreService = riskScoreService;
        this.visitLogRepository = visitLogRepository;
    }

    @PostMapping("/{visitId}")
    public RiskScoreEntity calculate(@PathVariable Long visitId) {

        Optional<VisitLogEntity> visitLogOpt = visitLogRepository.findById(visitId);
        VisitLogEntity visitLog = visitLogOpt.orElseThrow(() -> new ResourceNotFoundException("Visit not found"));

        return riskScoreService.calculateRiskScore(visitLog);
    }
}
