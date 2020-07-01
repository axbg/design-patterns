package com.axbg.behavioral.memento;

public class Memento {

    private String text;

    Memento(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "text='" + text + '\'' +
                '}';
    }
}
