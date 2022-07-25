package test.jour1;

import java.util.Scanner;

public class Tva {
    // calcule le prix TTC d'un article
    public static void main(String[] args) {
        final double TVA = 20.0 / 100;
        Scanner console = new Scanner(System.in);
        System.out.println("Prix Ht de l'article");
        double prixtHT = console.nextDouble();
        System.out.printf("Prix TTC de l'article : %.2f€%n", prixtHT * (1 + TVA));
        console.close();
    }
}
