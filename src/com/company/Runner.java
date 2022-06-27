package com.company;


public class Runner {

    public static int rowsX = 10;
    public static int columnsY = 10;
    public static int numberOfPlants = 6;


    public static void main(String[] args) {
        startNewSimulation();
    }

    private static void startNewSimulation() {
        Simulation simulation = new Simulation(rowsX, columnsY, numberOfPlants);
        simulation.fillFieldWithEmptyObjects();
        simulation.startSimulation();

    }
}

