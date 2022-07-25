package test.jour1;

import java.util.Scanner;

public class Saisir {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Prix HT de l'article ?");
        double prixHT = console.nextDouble();
        console.nextLine();
        System.out.println("Quantité ?");
        int qte = console.nextInt();

        // Pourquoi cela ne sort aucune valeur ?
        System.out.printf("Prix TTC de l'article : %.0f%n euros", prixHT * qte);

        console.close();
    }
}
