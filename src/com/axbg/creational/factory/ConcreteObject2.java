package com.axbg.creational.factory;

public class ConcreteObject2 extends AObject {

    public ConcreteObject2(String name) {
        super(name);
    }

    @Override
    public void printMyType() {
        System.out.println("My type is 2");
    }
}
