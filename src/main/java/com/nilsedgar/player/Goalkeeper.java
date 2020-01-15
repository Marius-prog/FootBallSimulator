package com.nilsedgar.player;

public class Goalkeeper extends Player {

    private int savingAbility; // Goalkeeper only

    public Goalkeeper(String name, int number) {
        super(name, number);

        this.savingAbility = (int)(Math.random() * (3 + 1));
    }

    public int getSavingAbility() {
        return savingAbility;
    }
}
