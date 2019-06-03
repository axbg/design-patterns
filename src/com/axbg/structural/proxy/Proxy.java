package com.axbg.structural.proxy;

public class Proxy implements CommonInterface {
    Resource resource = null;
    String URL;

    public Proxy(String URL) {
        this.URL = URL;
    }

    @Override
    public void connect() {
        if (resource == null) {
            resource = new Resource(URL);
        }

        resource.connect();
    }
}
