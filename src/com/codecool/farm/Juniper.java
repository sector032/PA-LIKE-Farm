package com.codecool.farm;

public class Juniper extends Plant {

    public Juniper() {
        super();
        this.isEverGreen = true;
        this.baseProduction = 14;
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
        return 0;
    }

    @Override
    public int reduceProduction() {
        //TODO
        return 0;
    }

    public void speak() {
        System.out.println(this.getClass().getSimpleName() + " at full production!");
    }


}
