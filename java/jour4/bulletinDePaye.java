package test.jour4;

import java.util.Scanner;

public class bulletinDePaye {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Nom de la personne ?");
        String nom = console.nextLine();
        System.out.println("Statut ? ['agent de service', 'employé de bureau', 'Cadre']");
        String statut = console.nextLine();
        System.out.println("Nombre d'heure travaillées ?");
        int heureTotal = console.nextInt();
        System.out.println("Taux horaire ?");
        double tauxHoraire = console.nextDouble();
        System.out.println("Nombre d'enfants ?");
        int nbEnfants = console.nextInt();

        double tauxMajoration50 = 1.5;
        double tauxMajoration60 = 1.6;

        int heureMajore50 = heureTotal > 169 ? heureTotal - 169 : 0;
        int heureMajore60 = heureTotal > 180 ? heureTotal - 180 : 0;

        int heureSansMajore = heureTotal < 169 ? heureTotal : heureTotal - (heureMajore50 + heureMajore60);

        double salaireBrut = heureTotal < 168 ? heureTotal * tauxHoraire
                : (heureSansMajore * tauxHoraire) + (heureMajore50 * (tauxHoraire * tauxMajoration50))
                        + (heureMajore60 * (tauxHoraire * tauxMajoration60));

        System.out.printf("Bulletin de %s%n", nom);

        System.out.printf("Statut: %s%n", statut);

        System.out.printf(
                "Salaire brut: %.2f euros (%s h sans majoration, %s h avec  une majoration de 50 pourcent, %s h avec une majoration de 60 pourcent)",
                heureTotal < 168 ? heureTotal * tauxHoraire
                        : (heureSansMajore * tauxHoraire) + (heureMajore50 * (tauxHoraire * tauxMajoration50))
                                + (heureMajore60 * (tauxHoraire * tauxMajoration60)),
                heureSansMajore,
                heureTotal > 168 ? heureMajore50 : 0,
                heureTotal > 179 ? heureMajore60 : 0);

        System.out.printf("%n Calcul  des cotisations %s%n", nom);

        System.out.printf(
                "- Contribution pour le remboursement de la dette sociale et contribution sociale généralisée imposable %n %.2f x 3.49%%  = %.2f euros %n",
                salaireBrut, salaireBrut * 0.0349);

        System.out.printf(
                "- Contribution sociale généralisée non imposable %n %.2f x 6.15%% = %.2f euros  %n",
                salaireBrut, salaireBrut * 0.0615);

        System.out.printf(
                "- Assurance maladie %n %.2f x 0.95%% = %.2f euros  %n",
                salaireBrut, salaireBrut * 0.0095);

        System.out.printf(
                "- Assurance vieillesse %n %.2f x 8.44%% = %.2f euros  %n",
                salaireBrut, salaireBrut * 0.0844);

        System.out.printf(
                "- Assurance chômage %n %.2f x 3.05%% = %.2f euros  %n",
                salaireBrut, salaireBrut * 0.0305);

        System.out.printf(
                "- Retraite complémentaire %n %.2f x 3.81%% = %.2f euros  %n",
                salaireBrut, salaireBrut * 0.0381);

        System.out.printf(
                "- Cotisation AGFF %n %.2f x 1.02%% = %.2f euros  %n",
                salaireBrut, salaireBrut * 0.0102);

        System.out.printf(
                "Total cotisation: %.2f euros  %n",
                (salaireBrut * 0.0349) +
                        (salaireBrut * 0.0615) +
                        (salaireBrut * 0.0095) +
                        (salaireBrut * 0.0844) +
                        (salaireBrut * 0.0305) +
                        (salaireBrut * 0.0381) +
                        (salaireBrut * 0.0102));
        System.out.printf(
                "Salaire net:  %.2f euros  %n",
                salaireBrut - ((salaireBrut * 0.0349) +
                        (salaireBrut * 0.0615) +
                        (salaireBrut * 0.0095) +
                        (salaireBrut * 0.0844) +
                        (salaireBrut * 0.0305) +
                        (salaireBrut * 0.0381) +
                        (salaireBrut * 0.0102)));

        System.out.printf(
                "Prime familiale:  %.2f euros  %n",
                nbEnfants * 27.5);

        System.out.printf(
                "Salaire net à payer:  %.2f euros  %n",
                salaireBrut - ((salaireBrut * 0.0349) +
                        (salaireBrut * 0.0615) +
                        (salaireBrut * 0.0095) +
                        (salaireBrut * 0.0844) +
                        (salaireBrut * 0.0305) +
                        (salaireBrut * 0.0381) +
                        (salaireBrut * 0.0102) +
                        (nbEnfants * 27.5)));

        console.close();

    }

}
