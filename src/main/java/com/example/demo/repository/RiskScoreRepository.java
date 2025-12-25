package com.example.demo.repository;

import com.example.demo.model.RiskScoreModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RiskScoreRepository {

    private final List<RiskScoreModel> scores = new ArrayList<>();

    public RiskScoreModel save(RiskScoreModel score) {
        scores.add(score);
        return score;
    }

    public List<RiskScoreModel> findAll() {
        return scores;
    }
}
