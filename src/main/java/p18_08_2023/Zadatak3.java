package p18_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("POCETAK");

        //Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2 ili sa 3.
        // Ispisati poruke na kraju programa u obe situacije.

        System.out.println("Unesite broj: ");
        int a = s.nextInt();

        if ((a % 2) == 0) {
            System.out.println("Broj je deljiv sa 2");
        }

        if  ((a % 3) == 0) {
            System.out.println("Broj je deljiv sa 3");
        }

        System.out.println("KRAJ");
    }
}
