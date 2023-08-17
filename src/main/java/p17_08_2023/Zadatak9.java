package p17_08_2023;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("POCETAK");

        System.out.println("Znak karte na stolu: ");
        String znak = s.next();

        System.out.println("Broj karte na stolu:");
        String broj = s.next();

        System.out.println("Znak karte koju zelis da odigras: ");
        String znakZelim = s.next();

        System.out.println("Broja karte koju zelis da odigras:");
        String brojZelim = s.next();

        if (znak.equals(znakZelim) || (broj.equals(brojZelim))) {
            System.out.println("Potez je validan.");
        } else {
            System.out.println("Potez nije validan");
        }

        System.out.println("KRAJ");
    }
}
