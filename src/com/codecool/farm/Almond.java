package com.codecool.farm;

import java.util.Random;

public class Almond extends Plant {
    public int chanceToShroom;
    public int chanceToRot;
    public int currentProduction;

    public Almond() {
        super();
        this.isEverGreen = false;
        this.baseProduction = 50;

    }

    @Override
    public void checkProduction() {
        if (currentProduction < 40) {
            currentProduction *= 2;
        }
    }

    @Override
    public int boostProduction() {
        if (hasShroom()) {
            return 10;
        }
        return 0;
    }

    @Override
    public int reduceProduction() {
        setRotten();
        if (isRotten()) {
            return 18;
        }
        return 0;
    }


    public boolean hasShroom() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber < 8;
    }

    public void setRotten() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        this.isRotten = randomNumber < 13;
    }
}
