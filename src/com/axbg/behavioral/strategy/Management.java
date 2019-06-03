package com.axbg.behavioral.strategy;

public class Management {

    IStrategy strategy;
    Employee[] employees;

    public Management(IStrategy strategy, Employee[] employees) {
        this.strategy = strategy;
        this.employees = employees;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public void giveRaise(int number) {
        strategy.giveRaise(employees, number);
    }
}
