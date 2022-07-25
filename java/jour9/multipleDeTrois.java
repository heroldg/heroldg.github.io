package test.jour9;

import java.util.Scanner;

public class multipleDeTrois {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int multipleDeTrois;
        final int trois = 3;

        System.out.println("Entrez un multiple de 3");
        multipleDeTrois = console.nextInt();

        while (multipleDeTrois % trois != 0) {
            System.out.println("Erreur " + (multipleDeTrois) + " n'est pas un multiple de 3");
            multipleDeTrois = console.nextInt();
        }
        System.out.println("OK: " + multipleDeTrois + " est un multiple de 3");
        console.close();
    }
}