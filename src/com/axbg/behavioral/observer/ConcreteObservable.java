package com.axbg.behavioral.observer;

public class ConcreteObservable extends Observable {
    public void generateEvent() {
        super.notifyObservers();
    }
}
