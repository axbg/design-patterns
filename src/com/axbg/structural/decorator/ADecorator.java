package com.axbg.structural.decorator;

public abstract class ADecorator extends AObject {

    AObject decoratedObject;

    public ADecorator(AObject decoratedObject) {
        this.decoratedObject = decoratedObject;
    }

    @Override
    String printPrice() {
        return decoratedObject.printPrice();
    }
}
