package com.axbg.creational.singleton;

public class SingletonUser {

    private static SingletonUser instance = null;
    private String name;
    private int age;

    private SingletonUser() {
        super();
    }

    public static synchronized SingletonUser getInstance() {

        if (instance == null) {
            instance = new SingletonUser();
        }

        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SingletonUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
