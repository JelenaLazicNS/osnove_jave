package p18_08_2023;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Pocetak");

        int procenat = 0;

        System.out.println("Unesite duzinu videa-sekunde: ");
        int duzina = s.nextInt();

        System.out.println("Unesite trenutno vreme videa-sekunde:");
        int trenutnoVreme = s.nextInt();

        int procentat = trenutnoVreme*100/duzina;

        for (int i=0; i<=duzina; i++) {
            if (i<= procenat) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }


        System.out.println("Kraj");
    }
}
