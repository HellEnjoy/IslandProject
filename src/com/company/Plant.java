package com.company;


import java.util.ArrayList;
import java.util.Random;

public class Plant implements Fieldable {
    private int rowsX;
    private int columnsY;
    private Field field;
    private Simulation simulation;

    private ArrayList<Plant> plantArrayList = new ArrayList<>();

    private int numberOfPlants;

    Random randomNumber = new Random();

    @Override
    public String getSymbol() {
        return " \uD83C\uDF31 ";
    }

    public Plant(int rowsX, int columnsY, Simulation simulation) {
        this.rowsX = rowsX;
        this.columnsY = columnsY;
        this.simulation = simulation;
        this.field = simulation.getField();
        field.setFieldable(rowsX, columnsY, this);

    }
}



