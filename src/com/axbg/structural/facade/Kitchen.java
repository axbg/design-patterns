package com.axbg.structural.facade;

public class Kitchen {

    boolean isDoorOpen = false;

    public void unlockDoor() {
        isDoorOpen = true;
        System.out.println("Unlocking the door");
    }

    public void lockDoor() {
        isDoorOpen = false;
        System.out.println("Locking the door");
    }
}
