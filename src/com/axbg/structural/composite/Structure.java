package com.axbg.structural.composite;

import java.util.ArrayList;

public class Structure extends ANod {

    private String denumire;
    private ArrayList<ANod> nodes;

    Structure(String denumire) {
        this.denumire = denumire;
        nodes = new ArrayList<>();
    }

    @Override
    ANod getNod(int index) {
        if (index >= 0 && index < nodes.size()) {
            return nodes.get(index);
        }

        return null;
    }

    @Override
    void addNod(ANod nod) {
        nodes.add(nod);
    }

    @Override
    void removeNod(ANod nod) {
        nodes.remove(nod);
    }

    @Override
    void getInfo(String tab) {
        System.out.println(tab + "\tStructura " + this.denumire);
        System.out.println(tab + "\tCopii: ");

        for(ANod nod : nodes) {
            nod.getInfo(tab + "\t");
        }
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException();

    }

    @Override
    public String getLocation() {
        throw new UnsupportedOperationException();

    }

    @Override
    public void setLocation(String location) {
        throw new UnsupportedOperationException();
    }
}
