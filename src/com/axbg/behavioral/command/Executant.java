package com.axbg.behavioral.command;

class Executant {

    private String name;

    Executant(String name) {
        this.name = name;
    }

    void executeCommand(ACommand command) {
        System.out.println("Executing the command: " + name);
    }
}
