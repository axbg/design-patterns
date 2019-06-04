package com.axbg.behavioral.command;

import java.util.ArrayList;

public class Invoker {

    private ArrayList<ACommand> commands;

    Invoker() {
        commands = new ArrayList<>();
    }

    void addCommands(ACommand command) {
        this.commands.add(command);
    }

    public void removeCommands(ACommand command) {
        this.commands.remove(command);
    }

    void executeCommands() {
        for (ACommand command : commands) {
            command.execute();
        }

        commands.clear();
    }
}
