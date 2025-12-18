package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.exception.BadRequestException;
import com.example.demo.repository.*;
import com.example.demo.util.RiskLevelUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RiskScoreService {

    private final RiskRuleRepository riskRuleRepository;
    private final RiskScoreRepository riskScoreRepository;
    private final ScoreAuditLogRepository scoreAuditLogRepository;

    // ✅ Constructor Injection (MANDATORY)
    public RiskScoreService(RiskRuleRepository riskRuleRepository,
                            RiskScoreRepository riskScoreRepository,
                            ScoreAuditLogRepository scoreAuditLogRepository) {
        this.riskRuleRepository = riskRuleRepository;
        this.riskScoreRepository = riskScoreRepos
