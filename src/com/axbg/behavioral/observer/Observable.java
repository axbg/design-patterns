package com.axbg.behavioral.observer;

import java.util.ArrayList;

public abstract class Observable {

    ArrayList<Observer> observers;

    public Observable() {
        this.observers = new ArrayList<>();
    }

    void subscribeObserver(Observer observer) {
        this.observers.add(observer);
    }

    void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).notification();
        }
    }
}
