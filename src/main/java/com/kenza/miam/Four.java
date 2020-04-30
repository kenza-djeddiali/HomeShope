package com.kenza.miam;

public class Four {
    private Resistance resistance;
    private Soufflerie soufflerie;
    int puissance;
    int capacite;

    //Getter et Setter
    public Resistance getResistance() {
        return resistance;
    }
    public void setSoufflerie(Soufflerie soufflerie) {
        this.soufflerie = soufflerie;
    }

    public void cuire(Aliment aliment) {
        System.out.println("Je cuis un aliment: "+aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
        aliment.estCuit = true;
    }
    public void cuire(int temperature, int duree) {
        if (temperature < 40 || temperature > 250)
            throw new IllegalArgumentException("La température du four doit être comprise en 40 et 250 degrés");
        if (duree <= 0)
            throw new IllegalArgumentException("La durée doit être positive");
        System.out.println("Je cuis un plat à " + temperature + " degrés, pendant " + duree + " minutes.");
    }
}
