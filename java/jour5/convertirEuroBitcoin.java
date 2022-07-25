package test.jour5;

import java.util.Scanner;

public class convertirEuroBitcoin {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Combien d'euros vaut 1 bitcoin ?");
        double tauxConversion = console.nextDouble();
        console.nextLine();
        String encore;
        do {
            System.out.println("Quelle somme en euros voulez vous convertir en Bitcoin ?");
            double valeurEuros = console.nextDouble();
            console.nextLine();
            System.out.printf("Cela représente une somme de %.2f Bitcoin %n", valeurEuros / tauxConversion);
            System.out.println("Avez vous encore une conversion à effectuer ? [oui/non]");
            encore = console.nextLine();
        } while (encore.equals("oui"));
        console.close();

    }
}
