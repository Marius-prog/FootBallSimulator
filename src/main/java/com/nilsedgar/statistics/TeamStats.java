package com.nilsedgar.statistics;

import java.util.ArrayList;
import java.util.List;

public class TeamStats implements Comparable<TeamStats> {
    private int numberOfMatches; // Number of matches played.
    private int allPoints; // Points from plusMinusStats
    private int numberOfGoals;  // Number of goals made from all teams
    private List<Integer> plusMinusStats = new ArrayList(); // Example: [0, 3, 0, 1, 1]

    public int getNumberOfMatches() {
        return numberOfMatches;
    }

    public int getAllPoints() {
        return allPoints;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public List<Integer> getPlusMinusStats() {
        return plusMinusStats;
    }

    @Override
    public int compareTo(TeamStats teamStats) {
        return 0;
    }
}
