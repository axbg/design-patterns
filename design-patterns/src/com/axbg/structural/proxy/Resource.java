package com.axbg.structural.proxy;

public class Resource implements CommonInterface {

    private String URL;

    Resource(String URL) {
        this.URL = URL;
        handshake();
    }

    private void handshake() {
        System.out.println("Establishing handshake");
    }

    @Override
    public void connect() {
        System.out.println("Establishing connection");
    }

}
