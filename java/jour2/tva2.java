package test.jour2;

import java.util.Scanner;

public class tva2 {
    public static void main(String[] args) {
        double tva = 20.0 / 100;
        double prixHt;
        Scanner console = new Scanner(System.in);
        System.out.println("Prix HT de l'article ?");
        prixHt = console.nextDouble();
        console.nextLine();
        System.out.println("Ce produit bénéficie-t-il d(un taux de TVA réduit ?");
        String tvaReduite = console.nextLine();
        if (tvaReduite.equals("oui")) {
            System.out.println("Quel est le taux de (%) ?");
            tva = console.nextDouble() / 100;
            console.nextLine();
        }
        System.out.printf("Prix TTC de l'article: %2f€%n", prixHt * (1 + tva));
        console.close();

    }
}
