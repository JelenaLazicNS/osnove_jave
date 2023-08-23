package d22_08_2023;

import java.util.Scanner;

public class Domaci3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Unesite rimski broj: X
        //Arapski: 10
        //Unesite rimski broj: C
        //Arapski: 50
        //Unesite rimski broj: D
        //Arapski: 500
        //Unesite rimski broj: M
        //Arapski: 1000
        //Unesite rimski broj: I
        //Arapski: 1
        //Unesite rimski broj: KRAJ
        //Kraj programa.

        String rimski = "";
        int arapski = 0;

        while (!rimski.equals("Kraj")) {
            System.out.println("Unesite rimski broj: ");
            rimski = s.next();

            if (rimski.equals("I")) {
                System.out.println("Arapski: 1");
            }
            else if (rimski.equals("V")) {
                System.out.println("Arapski: 5");
            }
            else if (rimski.equals("X")) {
                System.out.println("Arapski: 10");
            }
            else if (rimski.equals("L")) {
                System.out.println("Arapski: 50");
            }
            else if (rimski.equals("C")) {
                System.out.println("Arapski: 100");
            }
            else if (rimski.equals("D")) {
                System.out.println("Arapski: 500");
            }
            else if (rimski.equals("M")) {
                System.out.println("Arapski: 1000");
            }
        }
        System.out.println("Kraj programa.");

    }
}
