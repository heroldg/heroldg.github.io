package test.jour10;

import java.util.Scanner;

public class asciiart {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int largeur;
        int hauteur;
        String caractere;

        System.out.println("Largeur ?");
        largeur = console.nextInt();

        System.out.println("Hauteur ?");
        hauteur = console.nextInt();

        System.out.print("Caratère ? ");
        caractere = console.next();

        for (int i = 0; i < hauteur; i++) {
            for (int m = 0; m < largeur - 1; m++) {
                System.out.print(caractere);
            }
            System.out.println(caractere);
        }
        console.close();
    }
}
