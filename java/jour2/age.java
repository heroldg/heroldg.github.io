package test.jour2;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("quel est votre âge ?");
        int age = console.nextInt();
        if (age >= 18) {
            System.out.println("Vous êtes majeur !");

        } else {
            System.out.println("Vous êtes mineur !");
        }
        console.close();
    }
}
