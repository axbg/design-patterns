package com.axbg.structural.proxy;

public class Proxy implements CommonInterface {

    private Resource resource = null;
    private String URL;

    Proxy(String URL) {
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
