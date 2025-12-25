package com.example.demo.repository;

import com.example.demo.entity.ScoreAuditLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreAuditLogRepository extends JpaRepository<ScoreAuditLogEntity, Long> {
    
    List<ScoreAuditLogEntity> findByVisitId(Long visitId);
}
