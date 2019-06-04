package com.axbg.behavioral.observer;

class ConcreteObservable extends Observable {
    void generateEvent() {
        super.notifyObservers();
    }
}
