package com.codecool.farm;

import java.util.Random;

public class Spruce extends Plant {
    public int maxProduction;
    public int chanceToShroom;
    public int chanceToRot;

    public Spruce() {
        super();
        this.isEverGreen = true;
        this.baseProduction = 26;

    }


    @Override
    public void checkProduction() {
        if (currentProduction >= 70) {
            speak();
            currentProduction = 70;
        }
    }


    @Override
    public int boostProduction() {
        if (hasShroom()) {
            return 15;
        }
        return 0;
    }

    @Override
    public int reduceProduction() {
        setRotten();
        if (isRotten()) {
            return 20;
        }
        return 0;
    }

    public void speak() {
        System.out.println(this.getClass().getSimpleName() + " at full production!");
    }


    public boolean hasShroom() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber < 5;
    }


    public void setRotten() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        this.isRotten = randomNumber < 4;
    }
}
