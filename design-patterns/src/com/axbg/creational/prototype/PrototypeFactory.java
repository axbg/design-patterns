package com.axbg.creational.prototype;

import java.util.HashMap;
import java.util.Map;

//PrototypeFactory used to simplify the usage of Prototype
//it's not mandatory for a prototype implementation, but helps
class PrototypeFactory {

    private static Map<String, AbstractPrototype> prototypeMap;

    static {
        prototypeMap = new HashMap<>();

        prototypeMap.put("first", new ConcretePrototype1());
        prototypeMap.put("second", new ConcretePrototype2());
    }

    static AbstractPrototype getPrototype(String type) {
        AbstractPrototype prototype = prototypeMap.get(type);

        if (prototype != null) {
            try {
                return (AbstractPrototype) prototype.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
