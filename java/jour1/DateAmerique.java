package test.jour1;

public class DateAmerique {
    public static void main(String[] args) {
        int valeur = 1492;
        String nom = "Christophe Colomb";
        double finesseGravure = 0.00000001;
        System.out.printf("L'Amerique a été découverte en %d par %s%n", valeur, nom);
        System.out.printf("La valeur %d équivaut à %X en base 16%n", valeur, valeur);
        System.out.printf("Pi vaut %f%n", Math.PI);
        System.out.printf("La finesse de gravure des processeurs est de %e m%n", finesseGravure);
    }
}
