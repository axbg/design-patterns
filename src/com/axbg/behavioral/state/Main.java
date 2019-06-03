package com.axbg.behavioral.state;

public class Main {
    public static void main(String[] args) {

        System.out.println("State pattern");

        ShopContext context = new ShopContext();

        context.placeCommand(1);
        context.placeCommand(2);
        context.placeCommand(3);
        context.placeCommand(4);

        context.sendCommands();

        context.placeCommand(5);

    }
}
