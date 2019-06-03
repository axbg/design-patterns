package com.axbg.behavioral.command;

public class Executant {

    String name;

    public Executant(String name) {
        this.name = name;
    }

    public void executeCommand(ACommand command) {
        System.out.println("Executing the command: " + name);
    }
}
