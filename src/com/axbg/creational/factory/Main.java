package com.axbg.creational.factory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Factory pattern");

        AObject typeOne = Factory.getType(EType.TypeOne, "Testing");
        AObject typeTwo = Factory.getType(EType.TypeTwo, "Factory");

        typeOne.printMyType();
        typeTwo.printMyType();
    }
}
