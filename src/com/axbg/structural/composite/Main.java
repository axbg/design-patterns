package com.axbg.structural.composite;

public class Main {
    public static void main(String[] args) {

        System.out.println("Composite pattern");

        ANod structureOne = new Structure("Structure One");
        ANod structureTwo = new Structure("Structure Two");
        ANod leafOne = new Leaf("Leaf 1", "Bucharest");
        ANod leafTwo = new Leaf("Leaf 2", "Cluj");
        ANod leafThree = new Leaf("Leaf 3", "Constanta");

        structureOne.addNod(structureTwo);
        structureOne.addNod(leafOne);

        structureTwo.addNod(leafTwo);
        structureTwo.addNod(leafThree);

        structureOne.getInfo("");
    }
}
