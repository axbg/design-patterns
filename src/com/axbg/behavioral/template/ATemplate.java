package com.axbg.behavioral.template;

public abstract class ATemplate {

    public void runCommands() {
        init();
        load();
        cleanUp();
    }

    public abstract void init();
    public abstract void load();
    public abstract void cleanUp();
}
