package com.axbg.behavioral.state;

public class UnavailableState implements IState {

    @Override
    public void placeCommand(Integer id, ShopContext ctx) {
        System.out.println("The system is currently full");
    }

}
