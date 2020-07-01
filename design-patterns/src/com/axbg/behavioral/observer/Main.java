package com.axbg.behavioral.observer;

public class Main {

    public static void main(String[] args) {

        System.out.println("Observer pattern");

        ConcreteObservable observable = new ConcreteObservable();

        Observer observer = new ConcreteObserver();
        Observer observer1 = new ConcreteObserver();

        observable.subscribeObserver(observer);
        observable.subscribeObserver(observer1);

        observable.generateEvent();
    }

}
