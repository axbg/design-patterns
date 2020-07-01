package com.axbg.behavioral.command;

public class Main {

    public static void main(String[] args) {
        System.out.println("Command pattern");

        Invoker invoker = new Invoker();

        Executant executant1 = new Executant("first");
        Executant executant2 = new Executant("second");

        ACommand command = new ConcreteCommand(executant1);
        ACommand command1 = new ConcreteCommand(executant1);
        ACommand command2 = new ConcreteCommand(executant2);

        invoker.addCommands(command);
        invoker.addCommands(command1);
        invoker.addCommands(command2);

        invoker.executeCommands();
    }

}
