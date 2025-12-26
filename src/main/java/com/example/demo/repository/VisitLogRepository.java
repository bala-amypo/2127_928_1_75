package com.example.demo.repository;

import com.example.demo.model.VisitLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface VisitLogRepository extends JpaRepository<VisitLog, Long> {

    List<VisitLog> findByVisitorIdAndEntryTimeAfter(Long visitorId, LocalDateTime since);

    @Query("""
        SELECT COUNT(v) FROM VisitLog v
        WHERE v.visitorId = :visitorId
        AND v.entryTime BETWEEN :start AND :end
    """)
    long countVisitsInWindow(Long visitorId,
                             LocalDateTime start,
                             LocalDateTime end);
}
