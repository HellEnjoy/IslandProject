package com.company.animals;
import com.company.Field;

import java.util.Random;

public abstract class Animal {

    Field field;
    Random random;

    int row;

    public int getRow() {
        return row;
    }

    int col;

    public int getCol() {
        return col;
    }

    int maxMoves;

    public abstract void Action();

    public void Move() {
        for(int i = 0; i < maxMoves; i++) {
            switch (random.nextInt(4)) {
                // Right movement
                case 1 -> {
                    if(field.getRows() - 1 > row) row++;
                }
                // Left movement
                case 2 -> {
                    if(row-- >= 0) row--;
                }
                // Up movement
                case 3 -> {
                    if(field.getCols() - 1 > col) col++;
                }
                // Down movement
                case 4 -> {
                    if(col-- >= 0) col--;
                }
            }
        }
    }
}
