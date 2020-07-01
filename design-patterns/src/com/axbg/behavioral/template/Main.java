package com.axbg.behavioral.template;

public class Main {

    public static void main(String[] args) {

        System.out.println("Template pattern");

        ATemplate fastInstaller = new FastInstaller();
        ATemplate slowInstaller = new SlowInstaller();

        slowInstaller.runCommands();
        fastInstaller.runCommands();
    }

}
