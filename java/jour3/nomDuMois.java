package test.jour3;

import java.util.Scanner;

public class nomDuMois {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Saissisez le numéro du mois dans lequel nous sommes :");
        int mois = console.nextInt();
        switch (mois) {
            case 1:
                System.out.println("Nous sommes en: Janvier");
                break;

            case 2:
                System.out.println("Nous sommes en: Février");
                break;

            case 3:
                System.out.println("Nous sommes en: Mars");
                break;

            case 4:
                System.out.println("Nous sommes en: Avril");
                break;

            case 5:
                System.out.println("Nous sommes en: Mai");
                break;

            case 6:
                System.out.println("Nous sommes en: Juin");
                break;

            case 7:
                System.out.println("Nous sommes en: Juillet");
                break;

            case 8:
                System.out.println("Nous sommes en: Août");
                break;

            case 9:
                System.out.println("Nous sommes en: Septembre");
                break;

            case 10:
                System.out.println("Nous sommes en: Octobre");
                break;

            case 11:
                System.out.println("Nous sommes en: Novembre");
                break;

            case 12:
                System.out.println("Nous sommes en: Décembre");
                break;

            default:
                System.out.println("Le mois que vous avez saisi n'est pas reconnu");

        }
        console.close();
    }
}
