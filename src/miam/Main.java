package miam;

public class Main {
    public static void main(String[] args) {
        Four petitFour = new Four();
        petitFour.capacite = 30;
        petitFour.puissance = 180;

        Aliment cake = new Aliment();
        cake.nom = "cake aux pommes";
        cake.estCuit = false;
        cake.manger();
        System.out.println("");
        petitFour.cuire(cake);
        System.out.println("");
        cake.manger();


    }
}
