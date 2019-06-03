package com.axbg.behavioral.state;

import java.util.ArrayList;

public class ShopContext {

    IState state;
    ArrayList<Integer> commandId;

    public ShopContext() {
        commandId = new ArrayList<>();
        this.state = new AvailableState();
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void placeCommand(Integer id) {
        if (this.commandId.size() >= 3) {
            this.state = new UnavailableState();
        }

        this.state.placeCommand(id, this);
    }

    public void addCommand(Integer id) {
        this.commandId.add(id);
    }

    public void sendCommands() {
        System.out.println("Delivering commands");
        for (Integer in : commandId) {
            System.out.println("Delivered: " + in);
        }
        commandId.clear();
        this.state = new AvailableState();
    }


}
