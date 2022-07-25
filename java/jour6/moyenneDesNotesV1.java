package test.jour6;

import java.util.Scanner;

public class moyenneDesNotesV1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(
                "Combien de notes souhaitez vous rentrez pour faire la moyen ? [écrire un chiffre ou un nombre] ");
        double nbNotes = console.nextInt();
        double notes = 0;
        for (int m = 0; m <= nbNotes - 1; m++) {
            System.out.println("notes :");
            console.nextLine();
            notes += console.nextDouble();

        }
        // int totalNotes = notes;
        console.close();
        System.out.printf("La moyen de est %.2f ", notes / nbNotes);

    }
}
