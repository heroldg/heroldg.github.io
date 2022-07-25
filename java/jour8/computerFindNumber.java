package test.jour8;

import java.util.Random;
import java.util.Scanner;

public class computerFindNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // int[] array1 = new int[100];

        Random r = new Random();
        int car = (int) (1 + r.nextInt(100 - 1 + 1));

        System.out.println("Choissisez un nombre compris entre 1 et 100, puis appuyez sur une touche (+ Touch Enter):");
        String keystart = console.nextLine();

        System.out.println("Je tente " + car + ", est-ce plus, moins ou est-ce le nombre(+/-/=) ?");
        String nextStep = console.nextLine();

        int tour = 0;

        while (!nextStep.equals("=")) {
            Random y = new Random();
            int varation = (int) y.nextInt(10);

            // array1[tour] = car;
            // if (car == array1.length) {
            // car++;
            // }
            if (nextStep.equals("-")) {
                System.out.println("Je tente " + (car = (car - varation))
                        + ", est-ce plus, moins ou est-ce le nombre(+/-/=) ?(car:" + car + "; varitation:"
                        + varation + ")");
                tour++;
                // System.out.println("array1" + array1.length);
            }

            if (nextStep.equals("+")) {
                System.out.println("Je tente " + (car = (car + varation))
                        + ", est-ce plus, moins ou est-ce le nombre(+/-/=) ?(car:" + car + "; varitation:"
                        + varation + ")");
                tour++;
                // System.out.println("array1" + array1[tour]);
            }
            nextStep = console.nextLine();

        }
        console.close();
        System.out.println("Super ! J'ai trouvé en " + tour + " tentatives, c'est le nombre " + car);

        // do {

        // nextStep = console.nextLine();

        // System.out.println("Super ! J'ai trouvé en " + tour + " tentatives, c'est le
        // nombre" + car);
        // } while (nextStep != "=");

    }
}
