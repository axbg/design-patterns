package com.axbg.behavioral.strategy;

import java.util.ArrayList;

public interface IStrategy {
    ArrayList<Employee> giveRaise(ArrayList<Employee> employees, int number);
}
