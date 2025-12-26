package com.example.demo.model;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class VisitLog {
    private Long id;
    private Visitor visitor;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
}
