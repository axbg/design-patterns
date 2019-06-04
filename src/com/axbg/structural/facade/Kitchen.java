package com.axbg.structural.facade;

class Kitchen {

    private boolean isDoorOpen = false;

    void unlockDoor() {
        isDoorOpen = true;
        System.out.println("Unlocking the door");
    }

    void lockDoor() {
        isDoorOpen = false;
        System.out.println("Locking the door");
    }

}
