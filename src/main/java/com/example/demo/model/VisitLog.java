package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitLog {
    private Long id;
    private Visitor visitor;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
}
