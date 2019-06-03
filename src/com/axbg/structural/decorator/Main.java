package com.axbg.structural.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator pattern");

        AObject firstObject = new Undecorated();
        System.out.println(firstObject.printPrice());

        AObject decoratedObject = new ConcreteDecorator(firstObject);
        System.out.println(decoratedObject.printPrice());

        AObject moreDecoratedObject = new ConcreteDecorator(decoratedObject);
        System.out.println(moreDecoratedObject.printPrice());

    }
}
