package com.axbg.creational.factory;

public class Factory {

    public static AObject getType(EType type, String name) {

        AObject object = null;

        switch (type) {
            case TypeOne:
                object = new ConcreteObject1(name);
                break;
            case TypeTwo:
                object = new ConcreteObject2(name);
                break;
            default:
                break;
        }

        return object;
    }
}
