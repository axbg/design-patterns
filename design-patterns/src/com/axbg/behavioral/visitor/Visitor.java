package com.axbg.behavioral.visitor;

public interface Visitor {
    //can be rewritten into a single method
    //void visit(Visitable visitor);
    void visitPhone(Phone phone);

    void visitBook(Book book);
}
