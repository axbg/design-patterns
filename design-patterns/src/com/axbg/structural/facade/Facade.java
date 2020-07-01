package com.axbg.structural.facade;

class Facade {

    private Kitchen kitchen;
    private Chef chef;

    Facade() {
        kitchen = new Kitchen();
        chef = new Chef();
    }

    void openKitchen() {
        kitchen.unlockDoor();
        chef.prepareToCook();
    }

    void closeKitchen() {
        kitchen.lockDoor();
        chef.goHome();
    }

}
