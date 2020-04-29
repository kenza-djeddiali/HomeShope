package com.kenza.homeshop;

public class ExpressDelivery implements Delivery{
    private String city;

    public ExpressDelivery(String city) {
        this.city = city;
    }
    @Override
    public double getPrice() {
        return 0;
    }
}
