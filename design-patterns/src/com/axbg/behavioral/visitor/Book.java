package com.axbg.behavioral.visitor;

public class Book implements Visitable {
    private final int price;

    public Book(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitBook(this);
    }
}
