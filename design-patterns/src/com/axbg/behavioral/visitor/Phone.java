package com.axbg.behavioral.visitor;

public class Phone implements Visitable {
    private int price;

    public Phone(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitPhone(this);
    }
}
