package com.example.demo.repository;

import com.example.demo.model.VisitLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface VisitLogRepository extends JpaRepository<VisitLog, Long> {

    // Used in testVisitCountQuery_simulation
    @Query("select v from VisitLog v where v.visitor.id = :visitorId and v.entryTime >= :since")
    List<VisitLog> findByVisitorSince(
            @Param("visitorId") Long visitorId,
            @Param("since") LocalDateTime since
    );

    // Used in testCustomQuery_countVisitsInWindow
    @Query("select count(v) from VisitLog v where v.visitor.id = :visitorId and v.entryTime between :start and :end")
    Long countVisitsInWindow(
            @Param("visitorId") Long visitorId,
            @Param("start") LocalDateTime start,
            @Param("end") LocalDateTime end
    );
}
