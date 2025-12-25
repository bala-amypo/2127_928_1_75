package com.example.demo.service;

import com.example.demo.entity.ScoreAuditLogEntity;
import com.example.demo.repository.ScoreAuditLogRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ScoreAuditLogService {

    private final ScoreAuditLogRepository scoreAuditLogRepository;

    public ScoreAuditLogService(ScoreAuditLogRepository scoreAuditLogRepository) {
        this.scoreAuditLogRepository = scoreAuditLogRepository;
    }

    public void logScoreChange(Long visitId, Integer oldScore, Integer newScore) {

        ScoreAuditLogEntity log = ScoreAuditLogEntity.builder()
                .visitId(visitId)
                .oldScore(oldScore)
                .newScore(newScore)
                .changedAt(LocalDateTime.now())
                .build();

        scoreAuditLogRepository.save(log);
    }
}
