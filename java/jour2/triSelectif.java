package test.jour2;

import java.util.Scanner;

public class triSelectif {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Que souhaitez vous jeter ?");
        String dechet = console.nextLine();
        switch (dechet) {
            case "papier":
            case "carton":
            case "boîte de conserve":
                System.out.println("à recycler");
                break;
            // Si la ponctuation est mise ("végétaux", "épluchures") le code ne fonctionne
            // pas et prend l'option par défauts "à mettre à la poubelle"
            case "vegetaux":
            case "epluchures":
                System.out.println("à composter");
                break;
            default:
                System.out.println("à mettre à la poubelle");
                break;

        }
        console.close();
    }
}
