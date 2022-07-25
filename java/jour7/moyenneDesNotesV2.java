package test.jour7;

import java.util.Scanner;

public class moyenneDesNotesV2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double notes = 0;
        double totalNotes = 0;
        int nbNotes = 0;
        do {
            System.out.println("Note (-1 pour terminer) ?");
            notes = console.nextDouble();
            if (notes == -1) {
                System.out.println("Votre moyen est la suivante : " + totalNotes / nbNotes);

            } else {

                totalNotes += notes;
                nbNotes++;
                System.out.println("Votre moyen est de : " + totalNotes / nbNotes);
            }

        } while (notes != -1);
        console.close();
    }
}

/*
 * 
 * Test non concluant qui à amèné un code qui fonctionne :
 * 
 * while (notes != -1) {
 * 
 * System.out.println("Note (-1 pour terminer) ?");
 * notes = console.nextDouble();
 * totalNotes += notes;
 * nbNotes++;
 * System.out.println("Votre moyen est de : " + totalNotes / nbNotes);
 * 
 * }
 */