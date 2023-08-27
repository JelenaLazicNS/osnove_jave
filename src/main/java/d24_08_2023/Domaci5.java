package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci5 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 3
        //Unesite broj: 7
        //Unesite broj: 3
        //Unesite broj: 9
        //Unesite X: 3
        //
        //Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3

        System.out.print("Unesite N: ");
        int niz = s.nextInt();

        for (int i=0; i<niz; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            A.add(broj);
        }
        System.out.print("Unesite X: ");
        int X = s.nextInt();

        String poruka = "Elementi niza A koji su jednaki broju X imaju indekse: ";

        for (int i = 0; i<A.size(); i++) {
            if (A.get(i)==X){
                poruka += i+", ";
            }
        }
        System.out.println(poruka);
    }
}
