package com.example.demo.repository;

import com.example.demo.entity.RiskScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RiskScoreRepository
        extends JpaRepository<RiskScoreEntity, Long> {

    // Optional: fetch scores by visitor
    List<RiskScoreEntity> findByVisitorId(Long visitorId);
}
