package com.axbg.behavioral.strategy;

public class Main {
    public static void main(String[] args) {

        System.out.println("Strategy pattern");

        IStrategy strategyHigh = new HighFirstStrategy();
        IStrategy strategyLow = new LowFirstStrategy();

        Management management = new Management(strategyHigh, new Employee[]{new Employee(20),
                new Employee(120), new Employee(150), new Employee(75), new Employee(10), new Employee(21),});

        management.giveRaise(50);

        management.setStrategy(strategyLow);

        System.out.println();

        management.giveRaise(50);
    }
}
