package com.axbg.behavioral.strategy;

public class Employee {

    int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
