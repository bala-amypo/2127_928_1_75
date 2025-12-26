package com.example.demo.util;

public class RiskLevelUtils {

    /**
     * Used in test cases:
     *  - testRiskLevelUtils_boundaries
     *  - testRiskScore_determineRiskLevel_various
     *
     * Boundary expectations from tests:
     *  score = 0   -> LOW
     *  score = 10  -> LOW
     *  score = 20  -> MEDIUM
     *  score = 30  -> MEDIUM
     *  score = 50  -> HIGH
     *  score = 80  -> CRITICAL
     */
    public static String determineRiskLevel(int score) {

        if (score < 20) {
            return "LOW";
        }

        if (score < 50) {
            return "MEDIUM";
        }

        if (score < 80) {
            return "HIGH";
        }

        return "CRITICAL";
    }
}
