package com.axbg.structural.decorator;

abstract class ADecorator extends AObject {

    private AObject decoratedObject;

    ADecorator(AObject decoratedObject) {
        this.decoratedObject = decoratedObject;
    }

    @Override
    String printPrice() {
        return decoratedObject.printPrice();
    }

}
