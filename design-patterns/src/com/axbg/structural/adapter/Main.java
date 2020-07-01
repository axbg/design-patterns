package com.axbg.structural.adapter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Adapter pattern");

        //without adapter
        ExistingInterface old = new OldImplementation();
        NewInterface nw = new NewImplementation();

        old.printDetail();
        nw.print();

        System.out.println();

        //with adapter
        ExistingInterface old2 = new AdapterInterface();
        NewInterface nw2 = new NewImplementation();

        old2.printDetail();
        nw2.print();
    }

}
