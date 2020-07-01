package com.axbg.behavioral.template;

public class SlowInstaller extends ATemplate {

    @Override
    public void init() {
        System.out.println("Init slow installer");
    }

    @Override
    public void load() {
        System.out.println("Loading slow installer");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cleanUp() {
        System.out.println("Cleaning up slow installer");
    }

}
