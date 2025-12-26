package com.example.demo.service;

import com.example.demo.model.RiskScoreModel;

public interface RiskScoreService {
    RiskScoreModel save(RiskScoreModel score);
    RiskScoreModel get(Long id);
}
