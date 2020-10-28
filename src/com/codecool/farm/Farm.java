package com.codecool.farm;

import java.util.ArrayList;

public class Farm {
    public int MIN_PLANTS;

    public int getTotalFood() {
        return totalFood;
    }

    public int totalFood;
    public ArrayList<Plant> plantList;
    public int currentMonth;


    public Farm(int MIN_PLANTS) {
        this.MIN_PLANTS = MIN_PLANTS;
        this.totalFood = 0;
        this.plantList = new ArrayList<>();
        this.currentMonth = 0;
    }

    public void generatePlants() {
        for (int i = 0; i < MIN_PLANTS; i++) {
            Spruce spruce = new Spruce();
            Juniper juniper = new Juniper();
            Almond almond = new Almond();
            plantList.add(spruce);
            plantList.add(juniper);
            plantList.add(almond);
        }
        System.out.println(plantList.toString());
    }

    public void updateFood() {
        for (Plant plant : plantList) {
            plant.checkFifthMonth(currentMonth);
            plant.updateProduction();
            System.out.println(plant);
            if (!checkRotten(plant)) {
                totalFood += plant.getCurrentProduction();
            }else{
                plant.isRotten = false;
            }
        }
    }

    public int getCurrentMonth() {
        return this.currentMonth;
    }

    public void updateMonth() {
        this.currentMonth++;
    }

    public boolean checkRotten(Plant plant) {
        return plant.isRotten;
    }

    @Override
    public String toString() {
        return "Current Month: " + getCurrentMonth() + " Total Food " + getTotalFood();
    }
}
