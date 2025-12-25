package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class VisitLogModel {
    private Long id;
    private Long visitorId;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
}
