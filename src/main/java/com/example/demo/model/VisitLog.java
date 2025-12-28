package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitLog {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Visitor visitor;

    private String purpose;
    private String location;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    @PrePersist
    public void onCreate() {
        if (entryTime == null) {
            entryTime = LocalDateTime.now();
        }
    }
}
