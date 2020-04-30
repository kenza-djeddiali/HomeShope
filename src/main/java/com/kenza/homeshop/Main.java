package com.kenza.homeshop;

public class Main {
    public static void main(String[] args) {
        Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        Television tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");
        Delivery lowCostRelayDelivery = new RelayDelivery(27);

        Bill bill = new Bill(customer,lowCostRelayDelivery);
        /*
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);
*/
        //bill.generate(new FileWriter("facture-leblanc")); //methode 1 generer un fichier
        try {
        //methode 2 afficher dans le console
        bill.generate(new Writer() {
            @Override
            public void start() {

            }

            @Override
            public void writeLine(String line) {
                System.out.println(line);
            }

            @Override
            public void stop() {

            }
        });
        }catch (NoProductInBillException e){
            System.err.println("Pas de produit dans la facture");
        }
        /*
            Généralisation
            Une fois que  tv  est considérée comme un  Product ,
            il n'est plus possible d'accéder aux fonctionnalités de  Television .

         */
       // Product tv2 = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
        //tv2.getDescription();
    }
}
