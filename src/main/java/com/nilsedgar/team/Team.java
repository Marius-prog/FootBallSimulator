package com.nilsedgar.team;

import com.nilsedgar.player.Player;
import com.nilsedgar.statistics.TeamStats;

import java.util.List;

public class Team implements Comparable<Team> {

    private List<Player> players;
    private String name;
    private TeamStats teamStats;
    private int currentGameGoals;

    public int getCurrentGameGoals() {
        return currentGameGoals;
    }

    public void setCurrentGameGoals(int currentGameGoals) {
        this.currentGameGoals = currentGameGoals;
    }

    public Team(List<Player> players, String name) {
        this.players = players;
        this.name = name;
        this.teamStats = new TeamStats();
        this.currentGameGoals = 0;
    }

    private static void createPlayersForTeam() {
        // add logic to have 11 players
    }

    public List<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public TeamStats getTeamStats() {
        return teamStats;
    }

    @Override
    public int compareTo(Team team) {
        int teamStatsComparisonResult = this.teamStats.compareTo(team.teamStats);
        if (teamStatsComparisonResult == 0) return this.name.compareTo(team.name);
        else return teamStatsComparisonResult;
    }

    public String getFormatedStats() {
        return String.format(
                "|%15s" + "|%5d" + "|%5d" + "|%5d" + "|%10s|",
                name,
                teamStats.getAllPoints(),
                teamStats.getNumberOfGoals(),
                teamStats.getNumberOfMatches(),
                teamStats.getPlusMinusStats());
    }
}
