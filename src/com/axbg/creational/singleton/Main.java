package com.axbg.creational.singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Singleton pattern");

        SingletonUser firstUser = SingletonUser.getInstance();

        firstUser.setAge(21);
        firstUser.setName("Alex");

        System.out.println(firstUser);

        SingletonUser secondUser = SingletonUser.getInstance();

        System.out.println(secondUser);
    }
}
