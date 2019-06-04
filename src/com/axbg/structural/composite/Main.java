package com.axbg.structural.composite;

public class Main {

    public static void main(String[] args) {

        System.out.println("Composite pattern");

        ANode structureOne = new Structure("Structure One");
        ANode structureTwo = new Structure("Structure Two");

        ANode leafOne = new Leaf("Leaf 1", "Bucharest");
        ANode leafTwo = new Leaf("Leaf 2", "Cluj");
        ANode leafThree = new Leaf("Leaf 3", "Constanta");

        structureOne.addNode(structureTwo);
        structureOne.addNode(leafOne);

        structureTwo.addNode(leafTwo);
        structureTwo.addNode(leafThree);

        structureOne.getInfo("");
    }

}
