package com.axbg.behavioral.chainofresponsibility;

public class Main {

    public static void main(String[] args) {


        System.out.println("Chain of responsibility pattern");

        AHandler employee = new Employee();
        AHandler manager = new Manager();

        employee.setSuccessor(manager);

        Request r1 = new Request("Do an action", 3);
        Request r2 = new Request("Give approval to hiring process", 8);
        Request r3 = new Request("Change CEO", 21);

        employee.processRequest(r1);
        System.out.println();

        employee.processRequest(r2);
        System.out.println();

        employee.processRequest(r3);
        System.out.println();

        manager.processRequest(r1);
    }

}
