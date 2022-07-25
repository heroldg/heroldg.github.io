package test.jour5;

public class tableDeMultiplication {
    public static void main(String[] args) {
        // affichage de la table de multiplication 7
        final int TABLE = 7;
        System.out.println("table de " + TABLE + ":");
        for (int m = 0; m <= 10; m++) {
            System.out.println(m + " x " + TABLE + " = " + m * TABLE);
        }
    }
}
