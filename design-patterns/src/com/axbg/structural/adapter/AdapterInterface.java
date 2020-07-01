package com.axbg.structural.adapter;

public class AdapterInterface extends NewImplementation implements ExistingInterface {

    @Override
    public void printDetail() {
        System.out.println("Calling old method");
        print();
    }

}
