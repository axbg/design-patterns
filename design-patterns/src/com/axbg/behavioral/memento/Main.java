package com.axbg.behavioral.memento;

public class Main {

    public static void main(String[] args) {

        System.out.println("Memento pattern");

        CareTaker careTaker = new CareTaker();

        TextProcessor textProcessor = new TextProcessor("Design Patterns");

        textProcessor.setText("Design patterns are nice.");
        careTaker.saveMemento(textProcessor.saveToMemento());
        System.out.println(textProcessor);

        textProcessor.setText("Design patterns are a nice thing to have.");
        careTaker.saveMemento(textProcessor.saveToMemento());
        System.out.println(textProcessor);

        textProcessor.setText("Design ");
        System.out.println(textProcessor);

        textProcessor.recoverFromMemento(careTaker.getMemento(0));
        System.out.println(textProcessor);

    }
}
