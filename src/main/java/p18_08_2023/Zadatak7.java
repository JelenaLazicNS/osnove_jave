package p18_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("POCETAK");

        System.out.print("Unesite jacinu zvuka: ");
        int jacina = s.nextInt();

        System.out.print("<");
        for (int i = 0; i <= jacina; i++) {
            System.out.print(" |");
        }System.out.println("KRAJ");
    }
}
