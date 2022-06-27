package com.company;

import java.util.ArrayList;
import java.util.Random;


public class Simulation {
    private int rowsX;
    private int columnsY;
    private Field field;
    private int numberOfPlants;

    Random randomNumber = new Random();

    private ArrayList<Plant> plantArrayList = new ArrayList<>();

    public Simulation(int rowsX, int columnsY, int numberOfPlants) {
        this.rowsX = rowsX;
        this.columnsY = columnsY;
        this.numberOfPlants = numberOfPlants;
        field = new Field(rowsX, columnsY);
    }

    public Field getField() {
        return this.field;
    }

    public void fillFieldWithEmptyObjects() {
        for (int i = 0; i < rowsX; i++) {
            for (int j = 0; j < columnsY; j++) {
                field.setFieldable(i, j, new Empty());
            }
        }
    }

    private void showNewField() {
        field.showField();
    }

    public void startSimulation() {
        possesPlants();
//        possesAnimals();
//        while(!isSimFinished){
        showNewField();
    }
//        checkIsSimFinished();
//    }

    private void possesPlants() {
        generatePlants();
    }

    private void possesAnimals() {

    }

        public void generatePlants () {
            for (int i = numberOfPlants - plantArrayList.size(); i > 0; ) {
                int rowPosition = randomNumber.nextInt(rowsX);
                int columnPosition = randomNumber.nextInt(columnsY);
                Plant plant = new Plant(rowPosition, columnPosition, this);
                plantArrayList.add(plant);
                i--;
            }
        }
    }


//        public void checkIsSimFinished() {
//            isSimFinished = true;




