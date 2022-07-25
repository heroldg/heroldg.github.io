package test.jour2;

import java.util.Scanner;

public class voyage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Combien de personnes participent au voyage ?");
        int nbPersonnes = console.nextInt();
        console.nextLine();
        System.out.println("Voulez vous une assurance annulation ?");
        boolean assurance = console.nextLine().equals("oui");

        System.out.printf("Le voyage est réservé pour %d personne%s %s assurance annulation", nbPersonnes,
                nbPersonnes > 1 ? "s" : "", assurance ? "avec" : "sans");
        console.close();
    }
}

// Scanner console = new Scanner(System.in);
// System.out.println("Combien de personnes participent au voyage ?");
// int nbPersonnes = console.nextInt();
// console.nextLine();
// System.out.println("Voulez vous une assurance annulation ?");
// String assurance = console.nextLine();
// console.close();
// System.out.printf("Le voyage est réservé pour %d personne%s %s assurance
// annulation",
// nbPersonnes > 1 ? "s" : "", assurance == "oui" ? "avec" : "sans");
// console.close();
// }
