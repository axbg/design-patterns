package com.axbg.behavioral.command;

public class ConcreteCommand extends ACommand {

    Executant executant;

    public ConcreteCommand(Executant executant) {
        this.executant = executant;
    }

    @Override
    public void execute() {
        executant.executeCommand(this);
    }
}
