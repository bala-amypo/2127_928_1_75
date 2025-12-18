package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private VisitorEntity visitor;

    private LocalDateTime entryTime;

    private LocalDateTime exitTime;

    private String purpose;

    private String location;

    @PrePersist
    public void prePersist() {
        if (entryTime == null) {
            entryTime = LocalDateTime.now();
        }
    }
}
