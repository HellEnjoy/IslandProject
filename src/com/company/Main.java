package com.company;

public class Main {
    public static void main(String[] args) {

        Field field = new Field(10, 20, 4);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            var all = field.getAllAnimals();
            for (int j = 0; j < all.size(); j++) {
                System.out.println("Sheep" + j + " pos: " + all.get(j).getRow() + ", " + all.get(j).getCol());
            }
            field.actionAll();
        }
    }
}
