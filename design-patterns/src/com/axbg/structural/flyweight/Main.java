package com.axbg.structural.flyweight;

public class Main {

    public static void main(String[] args) {

        Flyweight[] flyweights = new Flyweight[20];
        CustomProperty[] customs = new CustomProperty[20];

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                flyweights[i] = FlyweightFactory.getFlyweightType("TRUCK");
                customs[i] = new CustomProperty(i, "Red");
            } else {
                flyweights[i] = FlyweightFactory.getFlyweightType("CAR");
                customs[i] = new CustomProperty(i, "Blue");
            }
        }

        for (int i = 0; i < 20; i++) {
            flyweights[i].compose(customs[i]);
        }

        System.out.println("Generated " + FlyweightFactory.getLength());
    }

}
