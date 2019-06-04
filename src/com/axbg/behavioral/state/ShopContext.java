package com.axbg.behavioral.state;

import java.util.ArrayList;

public class ShopContext {

    IState state;
    ArrayList<Integer> commandId;

    ShopContext() {
        commandId = new ArrayList<>();
        this.state = new AvailableState();
    }

    public void setState(IState state) {
        this.state = state;
    }

    void placeCommand(Integer id) {
        if (this.commandId.size() >= 3) {
            this.state = new UnavailableState();
        }

        this.state.placeCommand(id, this);
    }

    void addCommand(Integer id) {
        this.commandId.add(id);
    }

    void sendCommands() {
        System.out.println("Delivering commands");

        for (Integer in : commandId) {
            System.out.println("Delivered: " + in);
        }

        commandId.clear();
        this.state = new AvailableState();
    }

}
