package com.company;

import com.company.animals.Animal;
import java.util.LinkedList;

public class Field {
    private LinkedList<Animal> allAnimals;
    private Location[][] allLocations;

    public Field(int rows, int cols) {
        allAnimals = new LinkedList<Animal>();
        allLocations = new Location[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                allLocations[i][j] = new Location();
            }
        }
    }

    public void IterateAll() {
        // Restore all grass
        for (int i = 0; i < allLocations.length; i++) {
            for (int j = 0; j < allLocations[i].length; j++) {
                allLocations[i][j].PutGrass();
            }
        }

        // Action all animals
        for(int i = 0; i < allAnimals.size(); i++){
            allAnimals.get(i).Action();
        }
    }
}
