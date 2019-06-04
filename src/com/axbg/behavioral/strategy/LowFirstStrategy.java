package com.axbg.behavioral.strategy;

import java.util.ArrayList;
import java.util.Comparator;

public class LowFirstStrategy implements IStrategy {

    @Override
    public ArrayList<Employee> giveRaise(ArrayList<Employee> employees, int number) {
        employees.stream().sorted(Comparator.comparing(employee -> employee.salary, Comparator.reverseOrder()))
                .forEach(employee -> {
                    if (employee.salary < number) employee.salary += 20;
                });

        return employees;
    }
}
