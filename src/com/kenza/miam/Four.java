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
}
