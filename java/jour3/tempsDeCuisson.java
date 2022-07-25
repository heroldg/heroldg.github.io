package test.jour3;

import java.util.Scanner;

public class tempsDeCuisson {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Quelle viande souhaitez vous ['boeuf' ou 'agneau']:");
        String viande = console.nextLine();

        System.out.println("la cuisson doit être ['bleu', 'a point' ou ' bien cuit']:");
        String cuisson = console.nextLine();

        System.out.println("le poids de votre viande est de (en gramme):");
        int poidsViande = console.nextInt();

        // A la base la structure choisi fut un if mais celle-ci ne renvoyait pas le
        // resultat dans le terminal, c'est pour cela que j'ai imbriqué deux switch l'un
        // dans l'autre. Cela permet de faire toutes les options. J'aimerai savoir
        // pourquoi mon if ne renvoyait rien ??

        switch (viande) {
            case "agneau":
                switch (cuisson) {
                    case "bleu":
                        System.out.println("votre viande de " + viande + " à une cuisson " + cuisson
                                + ". Cela veut dire qu'il vous faudra " + poidsViande * 2.25
                                + "secondes pour une cuisson " + cuisson + "");

                        break;
                    case "a point":
                        System.out.println("votre viande de " + viande + " à une cuisson " + cuisson
                                + ". Cela veut dire qu'il vous faudra " + poidsViande * 3.75
                                + "secondes pour une cuisson " + cuisson + "");

                        break;

                    case "bien cuit":
                        System.out.println("votre viande de " + viande + " à une cuisson " + cuisson
                                + ". Cela veut dire qu'il vous faudra " + poidsViande * 6
                                + "secondes pour une cuisson " + cuisson + "");

                        break;

                    default:
                        System.out.println("erreur");

                        break;
                }

                break;

            case "boeuf":

                switch (cuisson) {
                    case "bleu":
                        System.out.println("votre viande de " + viande + " à une cuisson " + cuisson
                                + ". Cela veut dire qu'il vous faudra " + poidsViande * 1.2
                                + "secondes pour une cuisson " + cuisson + "");

                        break;
                    case "a point":
                        System.out.println("votre viande de " + viande + " à une cuisson " + cuisson
                                + ". Cela veut dire qu'il vous faudra " + poidsViande * 2.04
                                + "secondes pour une cuisson " + cuisson + "");

                        break;

                    case "bien cuit":
                        System.out.println("votre viande de " + viande + " à une cuisson " + cuisson
                                + ". Cela veut dire qu'il vous faudra " + poidsViande * 3
                                + "secondes pour une cuisson " + cuisson + "");

                        break;

                    default:
                        System.out.println("erreur");
                        break;
                }

            default:
                break;
        }

        console.close();
    }
}

// System.out.println("votre viande de"+viande+"à une cuisson"+cuisson+". Cela
// veut dire qu'il vous faudra"+cuisson=="bleu"?poidsViande*2.25:cuisson=="à
// point"?poidsViande*3.75:cuisson=="bien cuit"?poidsViande*6:"____"+"secondes
// pour une cuisson"+cuisson);