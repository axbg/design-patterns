package com.axbg.structural.flyweight;

public class CustomProperty {

    int numberOfDoors;
    String color;

    public CustomProperty(int numberOfDoors, String color) {
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CustomProperty{" +
                "numberOfDoors=" + numberOfDoors +
                ", color='" + color + '\'' +
                '}';
    }
}
