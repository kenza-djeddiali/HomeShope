package com.kenza.paris;

public class Taxi implements MoyenDeLocomotion{
    @Override
    public void deplace(String adresse) {
        System.out.println("Je suis un bus et je vais à l'adresse " + adresse);
    }
}
