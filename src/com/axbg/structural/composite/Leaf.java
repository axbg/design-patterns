package com.axbg.structural.composite;

public class Leaf extends ANode {

    private String name;
    private String location;

    Leaf(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    void getInfo(String tab) {
        System.out.println(tab + "\tLeaf: " + name + " " + location);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

}
