package com.axbg.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class FlyweightFactory {

    private static Map<String, Flyweight> typesMap = new HashMap<>();

    static Flyweight getFlyweightType(String type) {
        Flyweight tp = typesMap.get(type);

        if (tp == null) {
            switch (type) {
                case "TRUCK":
                    tp = new FlyweightImplementation("TRUCK", 10, 8);
                    typesMap.put(type, tp);
                    break;
                case "CAR":
                    tp = new FlyweightImplementation("CAR", 5, 4);
                    typesMap.put(type, tp);
                    break;
                default:
                    break;
            }
        }

        return tp;
    }

    static int getLength() {
        return typesMap.size();
    }
}
