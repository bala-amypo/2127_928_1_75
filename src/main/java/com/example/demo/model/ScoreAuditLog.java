package com.example.demo.model;

import lombok.Data;
import lombok.*;

@Data
@No_ARGS_CONSTRUCTOR
@All_ARGS_CONSTRUCTOR
@Builder



public class ScoreAuditLog {
    private Long id;
    private String reason;
    private int scoreChange;
}
