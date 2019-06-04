package com.axbg.creational.factory;

public abstract class AObject {

    private String name;

    public AObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printMyType();

}
