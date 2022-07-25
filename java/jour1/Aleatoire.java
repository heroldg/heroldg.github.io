package test.jour1;

import java.util.Random;

public class Aleatoire {
    public static void main(String[] args) {
        Random r = new Random();
        int note = r.nextInt(21);
        // Faire une valeur aleatoire comprise entre min et max
        // int valeur = min + r.nextInt(max - min + 1);
        System.out.println("La copie vaut " + note + "/20");
        // Tirer un caractere aleéatoire compris entre min et max
        // char car = (char) (min + r.nextInt(max - min + 1));
    }
}
