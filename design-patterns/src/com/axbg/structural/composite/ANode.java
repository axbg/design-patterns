package com.axbg.structural.composite;

public abstract class ANode {

    ANode getNode(int index) {
        throw new UnsupportedOperationException();
    }

    void addNode(ANode node) {
        throw new UnsupportedOperationException();
    }

    void removeNode(ANode nod) {
        throw new UnsupportedOperationException();
    }

    abstract void getInfo(String tab);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getLocation();

    public abstract void setLocation(String location);
    
}
