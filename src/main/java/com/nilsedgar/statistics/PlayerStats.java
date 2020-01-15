package com.nilsedgar.statistics;

public class PlayerStats implements Comparable<PlayerStats> {
    private int numberOfBreaks;
    private int numberOfRescues;
    private int numberOfGoals;
    private int successfulPasses;

    public int getNumberOfBreaks() {
        return numberOfBreaks;
    }

    public int getNumberOfRescues() {
        return numberOfRescues;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public int getSuccessfulPasses() {
        return successfulPasses;
    }

    @Override
    public int compareTo(PlayerStats playerStats) {
        return 0;
    }
}
