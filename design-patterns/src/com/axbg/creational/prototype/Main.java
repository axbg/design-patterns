package com.axbg.creational.prototype;

public class Main {

    public static void main(String[] args) {

        System.out.println("Prototype pattern");

        AbstractPrototype prototypeOne = PrototypeFactory.getPrototype("first");
        AbstractPrototype prototypeThree = PrototypeFactory.getPrototype("first");
        AbstractPrototype prototypeTwo = PrototypeFactory.getPrototype("second");

        prototypeOne.setAge(5);
        prototypeTwo.setAge(20);
        prototypeThree.setAge(12);

        prototypeOne.setName("Alex");
        prototypeTwo.setName("Mike");
        prototypeThree.setName("John");

        System.out.println(prototypeOne);
        System.out.println(prototypeTwo);
        System.out.println(prototypeThree);
    }
}
