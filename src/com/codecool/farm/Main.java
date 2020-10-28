package com.codecool.farm;

public class Main {
    public static void main(String[] args) {
        //TODO
        Farm newFarm = new Farm(2);
        newFarm.generatePlants();

        for(int i = 0; i < 10; i++){
            newFarm.updateMonth();
            newFarm.updateFood();
            System.out.println(newFarm);
        }
    }
}
