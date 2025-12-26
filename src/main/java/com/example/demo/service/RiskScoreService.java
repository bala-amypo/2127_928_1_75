package com.example.demo.service;

import com.example.demo.model.RiskScoreModel;
import java.util.List;

public interface RiskScoreService {

    RiskScoreModel createScore(RiskScoreModel score);

    RiskScoreModel getScore(Long id);

    List<RiskScoreModel> getAllScores();
}
