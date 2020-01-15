package com.nilsedgar.player;

import com.nilsedgar.statistics.PlayerStats;

public abstract class Player implements Comparable<Player> {
    private int shooting; //  (chance to score)
    private int speed; // (can dribble up more than one position)
    private int breakAbility; // (break and take the ball from opponents)
    private PlayerStats playerStats; // (player Stats)
    private String name;
    private int number;

    public Player(String name, int number) {
        this.playerStats = new PlayerStats();
        this.name = name;
        this.number = number;

        this.shooting = (int)(Math.random() * (3 + 1));
        this.speed = (int)(Math.random() * (3 + 1));
        this.breakAbility = (int)(Math.random() * (3 + 1));
    }

    @Override
    public int compareTo(Player player) {
        int playerStatsComparisonResult = this.playerStats.compareTo(player.playerStats);
        if (playerStatsComparisonResult == 0) return this.name.compareTo(player.name);
        else return playerStatsComparisonResult;
    }

    public String getFormattedStats(){
        return String.format("|%30s|%5d|", name, playerStats.getNumberOfGoals());
    }

    public int getAction(){
        // We can control how much more agresive players are by controlling the parameter (0.5 - 0.35)
        return Math.random() >= 0.35 ? 1 : -1; // 0.0000 - 0.999999 1/2 > 0.5 ; 1 - 1/2 = 1/2
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getBreakAbility() {
        return breakAbility;
    }

    public void setBreakAbility(int breakAbility) {
        this.breakAbility = breakAbility;
    }

    public PlayerStats getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(PlayerStats playerStats) {
        this.playerStats = playerStats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
