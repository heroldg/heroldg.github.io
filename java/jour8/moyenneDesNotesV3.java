package test.jour8;

import java.util.Scanner;

public class moyenneDesNotesV3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double notes = 0;
        double totalNotes = 0;
        int nbNotes = 0;
        double nbNotesSup10 = 0;
        do {
            System.out.println("Note (-1 pour terminer) ?");
            notes = console.nextDouble();

            if (notes == -1) {
                // Faire un System.out.printf pour que les nombres a virgule s'arrete a 2
                // chiffres
                System.out.println(
                        "Votre moyen est la suivante : " + totalNotes / nbNotes + " (" + (nbNotesSup10 / nbNotes) * 100
                                + "% des notes des notes sont à 10/20");

            } else {

                if (notes > 10) {
                    nbNotesSup10++;
                }

                totalNotes += notes;
                nbNotes++;
                // Faire un System.out.printf pour que les nombres a virgule s'arrete a 2
                // chiffres
                System.out.println("Votre moyen est de : " + totalNotes / nbNotes);
                System.out.println("nombre de note au dessus de la moyen " + nbNotesSup10);

            }

            ;

        } while (notes != -1);
        console.close();
    }
}
