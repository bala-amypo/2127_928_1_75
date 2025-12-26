package com.example.demo.model;

import lombok.Data;
import java.time.LocalDateTime;
import lombok.*;

@Data
@No_ARGS_CONSTRUCTOR
@All_ARGS_CONSTRUCTOR
@Builder



public class VisitLog {
    private Long id;
    private Visitor visitor;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
}
