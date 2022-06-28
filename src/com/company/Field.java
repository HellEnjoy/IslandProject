package com.company;

import com.company.animals.Animal;
import com.company.animals.Sheep;

import java.util.LinkedList;
import java.util.Random;

public class Field {
    private LinkedList<Animal> allAnimals;

    public LinkedList<Animal> getAllAnimals() {
        return allAnimals;
    }

    private boolean[][] isGrass;
    private int rows;
    private int cols;

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public boolean getGrass(int row, int col) {
        return isGrass[row][col];
    }

    public void actionAll() {
        for(int i = 0; i < allAnimals.size(); i++) {
            allAnimals.get(i).Action();
        }
    }

    public Field(int rows, int cols, int animalsAmount) {
        allAnimals = new LinkedList<Animal>();
        this.rows = rows;
        this.cols = cols;
        Random random = new Random();
        for (int i = 0; i < animalsAmount; i++) {
            int start_row = random.nextInt(0, rows);
            int start_col = random.nextInt(0, cols);
            this.allAnimals.add(new Sheep(this, start_row, start_col));
        }
    }
}
