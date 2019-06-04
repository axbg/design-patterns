package com.axbg.structural.proxy;

public class Resource implements CommonInterface {

    String URL;

    public Resource(String URL) {
        this.URL = URL;
        handshake();
    }

    public void handshake() {
        System.out.println("Establishing handshake");
    }

    @Override
    public void connect() {
        System.out.println("Establishing connection");
    }
}
