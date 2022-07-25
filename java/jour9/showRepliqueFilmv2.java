package test.jour9;

import java.util.Random;
import java.util.Scanner;

public class showRepliqueFilmv2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int film = 0;
        String showReplique = "";
        System.out.println(
                "Tapez un chiffre suivi d'entrée pour avoir une repliques aléatoire(5 pour quitter l'application):");

        System.out.println("1 - Une répliqe de la cité de la peur");
        System.out.println("2 - Une répliqe James Bond");
        System.out.println("3 - Une répliqe la vie est un long fleuve tranquille");
        System.out.println("4 - Une répliqe Star War");
        System.out.println("5 - Quitter cette magnifique application");
        while (film != 5) {

            film = console.nextInt();
            Random r = new Random();
            if (film != 5) {
                film = (int) (1 + r.nextInt(4 - 1 + 1));

            }
            switch (film) {

                case 1:
                    showReplique = "Attention, c'est une véritable boucherie";

                    break;

                case 2:
                    showReplique = "Je m'appelle Bond, James Bond";

                    break;
                case 3:
                    showReplique = "Ne jurez pas Marie-Thérèse, ne jurez pas !";

                    break;

                case 4:
                    showReplique = "Je suis ton père !";

                    break;
                case 5:
                    showReplique = "";

                    break;

                default:
                    showReplique = "Je ne connais pas ce film !";

                    break;
            }

            System.out.println(showReplique);
        }
        System.out.println("Au revoir !");
        console.close();
    }
}
