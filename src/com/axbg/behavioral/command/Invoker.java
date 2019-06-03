package com.axbg.behavioral.command;

import java.util.ArrayList;

public class Invoker {

    ArrayList<ACommand> comenzi;

    public Invoker() {
        comenzi = new ArrayList<>();
    }

    public void addCommands(ACommand command) {
        this.comenzi.add(command);
    }

    public void removeCommands(ACommand command) {
        this.comenzi.remove(command);
    }

    public void executeCommands() {
        for (ACommand command : comenzi) {
            command.execute();
        }

        comenzi.clear();
    }
}
