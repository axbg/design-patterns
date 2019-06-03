package com.axbg.behavioral.template;

public class FastInstaller extends ATemplate {

    @Override
    public void init() {
        System.out.println("Init Fast installer");
    }

    @Override
    public void load() {
        System.out.println("Loading Fast installer");
    }

    @Override
    public void cleanUp() {
        System.out.println("Cleaning up Fast installer");
    }
}
