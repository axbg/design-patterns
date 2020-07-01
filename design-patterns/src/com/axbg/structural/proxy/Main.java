package com.axbg.structural.proxy;

public class Main {

    public static void main(String[] args) {

        System.out.println("Proxy pattern");

        CommonInterface resource = new Proxy("http://localhost:8080");

        resource.connect();

        resource.connect();
    }

}
