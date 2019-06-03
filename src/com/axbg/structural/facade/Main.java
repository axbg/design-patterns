package com.axbg.structural.facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Facade pattern");

        Facade facade = new Facade();

        facade.openKitchen();

        facade.closeKitchen();
    }
}
