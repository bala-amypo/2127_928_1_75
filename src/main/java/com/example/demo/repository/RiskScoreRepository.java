package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.RiskScoreModel;

public interface RiskScoreRepository extends JpaRepository<RiskScoreModel, Long> {
}
