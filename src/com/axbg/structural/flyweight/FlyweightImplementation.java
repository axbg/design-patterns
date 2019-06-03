package com.axbg.structural.flyweight;

public class FlyweightImplementation implements Flyweight {

    String type;
    int size;
    int numberOfWheels;

    public FlyweightImplementation(String type, int size, int numberOfWheels) {
        this.type = type;
        this.size = size;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "FlyweightImplementation{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }

    @Override
    public void compose(CustomProperty customProperty) {
        System.out.println(this.toString() + customProperty.toString());
    }
}
