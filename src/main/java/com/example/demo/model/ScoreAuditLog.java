package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScoreAuditLog {

    @Id
    @GeneratedValue
    private Long id;

    private Integer scoreChange;
    private String reason;
}
