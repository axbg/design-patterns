package com.axbg.structural.composite;

import java.util.ArrayList;

public class Structure extends ANode {

    private String structureName;
    private ArrayList<ANode> nodes;

    Structure(String structureName) {
        this.structureName = structureName;
        nodes = new ArrayList<>();
    }

    @Override
    ANode getNode(int index) {

        if (index >= 0 && index < nodes.size()) {
            return nodes.get(index);
        }

        return null;
    }

    @Override
    void addNode(ANode nod) {
        nodes.add(nod);
    }

    @Override
    void removeNode(ANode nod) {
        nodes.remove(nod);
    }

    @Override
    void getInfo(String tab) {
        System.out.println(tab + "\tStructure " + this.structureName);
        System.out.println(tab + "\tChildren: ");

        for (ANode node : nodes) {
            node.getInfo(tab + "\t");
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
