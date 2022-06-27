package com.company;

public class Field {
    public int rowsX = 0;
    public int columnsY = 0;
    public Fieldable[][] field;

    public Field(int rowsX, int columnsY) {
        this.rowsX = rowsX;
        this.columnsY = columnsY;
        field = new Fieldable[rowsX][columnsY];
    }

    public int getRowsX() {
        return rowsX;
    }

    public int getColumnsY() {
        return columnsY;
    }

    public Fieldable getFieldable(int x, int y) {
        return field[x][y];
    }

    public void setFieldable(int x, int y, Fieldable object) {
     field[x][y] = object;
    }

    public void showField(){

        System.out.println();

        for (int i = 0; i < rowsX; i++) {

            System.out.println();

            for (int j = 0; j < columnsY; j++) {

                System.out.print(field[i][j].getSymbol());

            }
        }

        System.out.println();
    }


}
