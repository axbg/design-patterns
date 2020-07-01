package com.axbg.behavioral.memento;

public class TextProcessor {

    private String title;
    private String text;

    TextProcessor(String title) {
        this.title = title;
        this.text = "";
    }

    void setText(String text) {
        this.text = text;
    }

    void recoverFromMemento(Memento memento) {
        this.text = memento.getText();
    }

    Memento saveToMemento() {
        return new Memento(text);
    }

    @Override
    public String toString() {
        return "TextProcessor{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
