package com.axbg.behavioral.visitor;

public interface Visitable {
    void acceptVisitor(Visitor visitor);
}
