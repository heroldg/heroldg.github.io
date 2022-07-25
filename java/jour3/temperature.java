package test.jour3;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Saisissez la temperature (dégres C°) :");
        int celsius = console.nextInt();
        System.out.printf(
                celsius < 2 ? "Risque de verglas | il fait actuellement : " + celsius + "C°"
                        : celsius < 15 && celsius > 2 ? "C'est pas chaud | il fait actuellement : " + celsius + "C°"
                                : celsius >= 15 && celsius < 30
                                        ? "Bonne température | il fait actuellement : " + celsius + "C°"
                                        : celsius > 30 ? "C'est trop chaud | il fait actuellement : " + celsius + "C°"
                                                : "Il fait actuellement : " + celsius);

        console.close();
    }
}
