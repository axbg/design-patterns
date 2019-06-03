package com.axbg.behavioral.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LowFirstStrategy implements IStrategy {

    @Override
    public void giveRaise(Employee[] employees, int number) {
        ArrayList emp = Arrays.stream(employees).sorted(Comparator.comparing(employee -> employee.salary))
                .map(employee -> employee.salary < number ? employee.salary + 20 : employee.salary)
                .collect(Collectors.toCollection(ArrayList::new));

        for(int i = 0; i < emp.size(); i++) {
            System.out.println(emp.get(i));
        }
    }
}
