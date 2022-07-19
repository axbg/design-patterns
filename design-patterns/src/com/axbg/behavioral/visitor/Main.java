package com.axbg.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Visitable> items = new ArrayList<>();
        Book book = new Book(250);
        Phone phone = new Phone(1200);

        items.add(book);
        items.add(phone);

        DiscountVisitor dvisitor = new DiscountVisitor(0.25, 0.3);

        for (Visitable visit : items) {
            visit.acceptVisitor(dvisitor);
        }

        System.out.println("Discount total: " + dvisitor.getTotalDiscount());
    }
}
