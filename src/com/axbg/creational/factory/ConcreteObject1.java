package com.axbg.creational.factory;

public class ConcreteObject1 extends AObject {
    public ConcreteObject1(String name) {
        super(name);
    }

    @Override
    public void printMyType() {
        System.out.println("My type is 1");
    }
}
