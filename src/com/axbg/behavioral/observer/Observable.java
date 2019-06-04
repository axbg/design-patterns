package com.axbg.behavioral.observer;

import java.util.ArrayList;

abstract class Observable {

    private ArrayList<Observer> observers;

    Observable() {
        this.observers = new ArrayList<>();
    }

    void subscribeObserver(Observer observer) {
        this.observers.add(observer);
    }

    void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    void notifyObservers() {
        for (Observer observer : observers) {
            observer.notification();
        }
    }

}
