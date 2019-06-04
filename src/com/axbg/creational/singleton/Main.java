package com.axbg.creational.singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Singleton pattern");

        SingletonUser firstUser = SingletonUser.getInstance();

        firstUser.setAge(21);
        firstUser.setName("Alex");

        SingletonUser secondUser = SingletonUser.getInstance();

        System.out.println(firstUser);

        secondUser.setAge(23);
        secondUser.setName("Carl");

        System.out.println(firstUser);
    }

}
