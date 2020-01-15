package com.nilsedgar.player;

public class Defender extends Player {

    // (TODO :: idea is to increase the breakability if defender successfully defends)
    private int breakBonus; // Defender only: breakBonus

    public Defender(String name, int number) {
        super(name, number);
        this.breakBonus = (int)(Math.random() * (3 + 1));
    }
}
