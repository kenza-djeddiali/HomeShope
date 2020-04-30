package com.kenza.paris;

public class Bus  implements MoyenDeLocomotion{
    @Override
    public void deplace(String adresse) {
        System.out.println("Je suis un taxi et je vais à l'adresse : " + adresse);
    }
}
