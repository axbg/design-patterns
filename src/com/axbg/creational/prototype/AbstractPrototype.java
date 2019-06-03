package com.axbg.creational.prototype;

public class AbstractPrototype implements Cloneable {

    String name;
    int age;

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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "AbstractPrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
