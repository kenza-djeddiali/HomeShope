package com.kenza.homeshop;

public class RelayDelivery implements Delivery{
    private int number;

    public RelayDelivery(int number) {
        this.number = number;
    }
        @Override
    public double getPrice() {
        return 0;
    }
}
