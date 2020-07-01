package com.axbg.behavioral.command;

public class ConcreteCommand extends ACommand {

    private Executant executant;

    ConcreteCommand(Executant executant) {
        this.executant = executant;
    }

    @Override
    public void execute() {
        executant.executeCommand(this);
    }

}
