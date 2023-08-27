package d24_08_2023;


import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        //
        //Unesite N: 6
        //Unesite broj: 1
       // Unesite broj: 5
      //  Unesite broj: 2
       // Unesite broj: 7
       // Unesite broj: 8
       // Unesite broj: -1

      //  Niz a: 1, 5, 2, 7, 8, -1
      //  Niz b: 1, 5, 2, 1, 1, 1



        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int niz = s.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        String porukaA = "Niz a: ";
        String porukaB = "Niz b: ";

        for (int i=0;  i < niz; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            a.add(broj);
            porukaA += a.get(i)+", ";
        }
        for (int i=0; i<a.size(); i++) {
            if (i<3) {
                b.add(a.get(i));
            } else b.add(1);
            porukaB+= b.get(i)+", ";
        }
        System.out.println(porukaA);
        System.out.println(porukaB);
    }
}
