package d22_08_2023;

import java.util.Scanner;

public class Domaci5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //(2 * ( 1 + 3))=
        //Unos: (
        //	Unos: 2
        //	Unos: *
        //	Unos: (
        //	Unos: 1
        //	Unos: +
        //	Unos: 3
        //	Unos: )
        //	Unos: )
        //	Unos: =
        //	Zagrade su uparene
        int counterLeva = 0;
        int counterDesna = 0;
        boolean kraj = false;

        while (!kraj) {
            System.out.println("Unos: ");
            String znak = s.next();

            if (znak.equals("(")) {
                counterLeva++;
            } else if (znak.equals(")")) {
                counterDesna++;
            }
            if (counterLeva == counterDesna) {
                System.out.println("Zagrade su uparene");
            }
            else{
                System.out.println("Zagrade nisu uparene");

            }
        }
    }
}

