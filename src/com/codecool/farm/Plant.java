package com.codecool.farm;

public abstract class Plant {
    public int baseProduction;
    public boolean isEverGreen;
    public int growthPerMonth;
    public int currentProduction;
    public boolean isRotten;
    public boolean isFifthMonth;

    public void checkFifthMonth(int month) {
        this.isFifthMonth = month % 5 == 0;
    }


    public Plant() {
        this.growthPerMonth = 4;
        this.isRotten = false;
    }

    public void updateProduction() {
        currentProduction = baseProduction;
        if (isEverGreen() && checkFifthMonth()) {
            currentProduction += 8;
        } else {
            currentProduction += 4;
        }
        currentProduction += this.boostProduction();
        currentProduction -= this.reduceProduction();
        checkProduction();
    }

    public abstract void checkProduction();

    public int getCurrentProduction() {
        return this.currentProduction;
    }

    public abstract int boostProduction();

    public abstract int reduceProduction();

    public boolean checkFifthMonth() {
        return isFifthMonth;
    }

    public boolean isEverGreen() {
        return isEverGreen;
    }

    public boolean isRotten() {
        return isRotten;
    }

    @Override
    public String toString() {
        return "Name: " + this.getClass().getSimpleName() + " Evergreen: " + isEverGreen() + " Current Production: " + getCurrentProduction() + " Rotten: " + isRotten();
    }
}
