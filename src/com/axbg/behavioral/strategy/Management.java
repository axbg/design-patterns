package com.axbg.behavioral.strategy;

import java.util.ArrayList;

class Management {

    private IStrategy strategy;
    private ArrayList<Employee> employees;

    Management(IStrategy strategy) {
        this.strategy = strategy;
        this.employees = new ArrayList<>();
    }

    void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        System.out.println();
    }

    void giveRaise(int number) {
        employees = strategy.giveRaise(employees, number);
    }

}
