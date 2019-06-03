package com.axbg.behavioral.state;

public class AvailableState implements IState {
    @Override
    public void placeCommand(Integer id, ShopContext ctx) {
        ctx.addCommand(id);
        System.out.println("Command was added");
    }
}
