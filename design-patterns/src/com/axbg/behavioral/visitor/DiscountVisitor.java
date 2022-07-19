package com.axbg.behavioral.visitor;

public class DiscountVisitor implements Visitor {
    private final double phoneDiscount;
    private final double bookDiscount;
    private float totalDiscount = 0;

    public DiscountVisitor(double phoneDiscount, double bookDiscount) {
        this.phoneDiscount = phoneDiscount;
        this.bookDiscount = bookDiscount;
    }

    @Override
    public void visitPhone(Phone phone) {
        this.totalDiscount += phone.getPrice() * this.phoneDiscount;
    }

    @Override
    public void visitBook(Book book) {
        this.totalDiscount += book.getPrice() * this.bookDiscount;
    }

    public float getTotalDiscount() {
        return this.totalDiscount;
    }
}
