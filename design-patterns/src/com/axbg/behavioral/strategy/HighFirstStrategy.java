package com.axbg.behavioral.strategy;

import java.util.ArrayList;
import java.util.Comparator;

public class HighFirstStrategy implements IStrategy {

    @Override
    public ArrayList<Employee> giveRaise(ArrayList<Employee> employees, int number) {
        employees.stream().sorted(Comparator.comparing(employee -> employee.getSalary(), Comparator.reverseOrder()))
                .forEach(employee -> {
                    if (employee.getSalary() > number) employee.setSalary(employee.getSalary() + 20);
                });

        return employees;
    }

}
