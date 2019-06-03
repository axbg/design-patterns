package com.axbg.structural.decorator;

public class ConcreteDecorator extends ADecorator {

    public ConcreteDecorator(AObject decoratedObject) {
        super(decoratedObject);
    }

    @Override
    String printPrice() {
        return super.printPrice() + ", but there will be an additional cost of 20 dollars";
    }
}
