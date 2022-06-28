package com.company.animals;

import com.company.Field;

import java.util.Random;

public class Snake extends Animal{
    @Override
    public void Action() {
        Move();
    }

    public Snake(Field field, int row, int col) {
        this.field = field;
        this.maxMoves = 1;
        this.row = row;
        this.col = col;
        this.random = new Random();
    }
}
