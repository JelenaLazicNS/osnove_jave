package d17_08_2023;

import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("POCETAK");

        //Primer izvrsenja:
        //	Unesite a: 44
        //	Unesite b: 2
        //	Nova vrednost za a je 24

        System.out.print("Unesite a: ");
        int a = s.nextInt();
        System.out.print("Unesite b: ");
        int b = s.nextInt();

        if (b==1) {
            System.out.println("Nova vrednost a je: " +(a+10));


        } else {
            System.out.println("Nova vrednost a je: " +(a-20));

        }

        System.out.println("KRAJ");
    }
}
