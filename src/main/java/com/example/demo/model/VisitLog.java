package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VisitLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long visitorId;

    private String purpose;

    private LocalDateTime visitedAt;

    @PrePersist
    public void prePersist() {
        if (visitedAt == null) {
            visitedAt = LocalDateTime.now();
        }
    }
}
