package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci4 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        //Primer izvrsenja:
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: -4
        //Unesite broj: 3
        //Unesite broj: -7
        //Unesite broj: 9
        //
        //Brojevi veci od nule u nizu A su: 1, 3, 9,

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int niz = s.nextInt();

        String poruka ="Brojevi veci od nule u nizu A su: ";

        for (int i=0; i<niz; i++) {
            System.out.print("Unesite broj ");
            int broj = s.nextInt();
            A.add(broj);
        }
        for (int i=0; i<A.size(); i++) {
            if (A.get(i)>0){
                poruka+= A.get(i)+", ";
            }
        }
        System.out.println(poruka);
    }
}
