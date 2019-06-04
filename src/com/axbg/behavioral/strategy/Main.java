package com.axbg.behavioral.strategy;

public class Main {
    public static void main(String[] args) {

        System.out.println("Strategy pattern");

        IStrategy strategyHigh = new HighFirstStrategy();
        IStrategy strategyLow = new LowFirstStrategy();

        Management management = new Management(strategyHigh);

        management.addEmployee(new Employee(20));
        management.addEmployee(new Employee(120));
        management.addEmployee(new Employee(35));
        management.addEmployee(new Employee(71));
        management.addEmployee(new Employee(210));

        management.giveRaise(50);
        management.printEmployees();

        management.setStrategy(strategyLow);
        management.giveRaise(50);
        management.printEmployees();
    }
}
