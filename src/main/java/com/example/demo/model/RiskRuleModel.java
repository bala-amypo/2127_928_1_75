package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "risk_rules")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RiskRuleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Rule type example:
     * LOCATION, DEVICE, FREQUENCY, TIME, KEYWORD
     */
    @Column(nullable = false)
    private String ruleType;

    /**
     * Rule value example:
     * "UNKNOWN_LOCATION", "NIGHT_TIME", "VPN", etc.
     */
    @Column(nullable = false)
    private String ruleValue;

    /**
     * Score impact (positive or negative)
     */
    @Column(nullable = false)
    private Integer scoreImpact;

    /**
     * Whether the rule is currently active
     */
    @Column(nullable = false)
    private Boolean active;
}
