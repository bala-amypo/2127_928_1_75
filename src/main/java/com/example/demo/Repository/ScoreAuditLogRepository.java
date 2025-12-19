package com.example.demo.repository;

import com.example.demo.entity.ScoreAuditLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreAuditLogRepository
        extends JpaRepository<ScoreAuditLogEntity, Long> {

    // Fetch audit logs for a visitor
    List<ScoreAuditLogEntity> findByVisitorId(Long visitorId);
}
