package com.axbg.structural.composite;

public abstract class ANod {

    ANod getNod(int index) {
        throw new UnsupportedOperationException();
    }

    void addNod(ANod nod) {
        throw new UnsupportedOperationException();
    }

    void removeNod(ANod nod) {
        throw new UnsupportedOperationException();
    }

    abstract void getInfo(String tab);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getLocation();

    public abstract void setLocation(String location);
}
