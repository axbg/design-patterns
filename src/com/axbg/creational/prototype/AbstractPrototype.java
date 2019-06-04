package com.axbg.creational.prototype;

public abstract class AbstractPrototype implements Cloneable {

    private String name = null;
    private int age = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
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
