package p12_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        ArrayList<Sastojak> sastojci = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N:");
        int n = s.nextInt();

        for (int i = 0; i<n; i++) {
            System.out.println("Unesite naziv sastojka: ");
            String naziv = s.next();
            System.out.println("Unesite cenu sastojka:");
            int cena = s.nextInt();
            sastojci.add(new Sastojak(naziv, cena));
        }
        for (int i=0; i<n; i++ ) {
            sastojci.get(i).stampaj();
        }
        



    }
}
