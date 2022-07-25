package test.jour1;

import java.util.Random;

public class CaractereAleatoire {
    public static void main(String[] args) {
        Random r = new Random();
        char car = (char) ('a' + r.nextInt('z' - 'a' + 1));
        System.out.printf("Caractère tiré aléatoirement: " + car);
    }
}
