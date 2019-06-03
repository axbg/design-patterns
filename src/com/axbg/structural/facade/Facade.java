package com.axbg.structural.facade;

public class Facade {

    Kitchen kitchen;
    Chef chef;

    public Facade() {
        kitchen = new Kitchen();
        chef = new Chef();
    }

    public void openKitchen() {
        kitchen.unlockDoor();
        chef.prepareToCook();
    }

    public void closeKitchen() {
        kitchen.lockDoor();
        chef.goHome();
    }
}
