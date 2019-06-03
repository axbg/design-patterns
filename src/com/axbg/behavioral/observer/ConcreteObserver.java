package com.axbg.behavioral.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void notification() {
        System.out.println("Observer notified");
    }
}
