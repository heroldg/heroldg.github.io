package test.jour5;

import java.util.Scanner;

public class QuestionGeographique {
    public static void main(String[] args) {
        // fait saisir l'utilisateur jusqu'a ce qu'il saisisse la bonne réponse
        Scanner console = new Scanner(System.in);
        // amorce
        System.out.println("Quelle est la capitale de la France ?");
        String saisie = console.nextLine();
        // consition
        while (!saisie.equals("Paris")) {
            // traiement
            System.out.println("Vous vous êtes trompé !");
            // relance
            System.out.println("Réessayez... La capitale de la France ?");
            saisie = console.nextLine();
        }
        console.close();
        System.out.println("Bravo");
    }
}
