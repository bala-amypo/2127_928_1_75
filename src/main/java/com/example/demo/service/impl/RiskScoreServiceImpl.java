package com.example.demo.service.impl;

import com.example.demo.model.RiskScore;
import com.example.demo.model.Visitor;
import com.example.demo.repository.RiskScoreRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.RiskScoreService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    private final RiskScoreRepository repo;
    private final VisitorRepository visitorRepo;

    public RiskScoreServiceImpl(RiskScoreRepository repo, VisitorRepository visitorRepo) {
        this.repo = repo;
        this.visitorRepo = visitorRepo;
    }

    @Override
    public RiskScore evaluateVisitor(Long visitorId) {
        return RiskScore.builder().id(visitorId).totalScore(0).riskLevel("LOW").build();
    }

    @Override
    public RiskScore getScoreForVisitor(Long visitorId) {
        return RiskScore.builder().id(visitorId).totalScore(0).riskLevel("LOW").build();
    }

    @Override
    public List<RiskScore> getAllScores() {
        return Collections.emptyList();
    }
}
