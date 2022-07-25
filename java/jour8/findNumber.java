package test.jour8;

import java.util.Random;
import java.util.Scanner;

public class findNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        int car = (int) (1 + r.nextInt(100 - 1 + 1));
        // /* la ligne commenté ci-dessous permet de voir le nombre recherché */
        // System.out.printf("nombre: " + car + "%n");
        System.out.println("A quel nombre entre 1 et 100 je pense ?");
        int nombreUtilisateur = console.nextInt();

        while (nombreUtilisateur != car) {

            if (nombreUtilisateur > car) {
                System.out.println("C'est moins !");

            }
            if (nombreUtilisateur < car) {
                System.out.println("C'est plus !");

            }
            nombreUtilisateur = console.nextInt();
        }

        System.out.println("Bravo ! c'était " + car);
        console.close();

    }

}
