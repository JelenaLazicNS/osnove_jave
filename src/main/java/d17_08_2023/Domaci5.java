package d17_08_2023;

import java.util.Scanner;

public class Domaci5 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("POCETAK");

        //Unestite a: 6                                        Unestite a: 6
        //Unesite b: 3                                         Unesite b: 3
        //Unesite operator: +                             Unesite operator: /
        //Rezultat: 9                                           Rezultat: 2

        System.out.print("Unesite a: ");
        int a = s.nextInt();
        System.out.print("Unesite b: ");
        int b = s.nextInt();
        System.out.print("Unesite operator: ");
        String operator = s.next();

        String plus = "+";
        String minus= "-";
        String puta= "*";
        String podeljeno= "/";

        if (operator.equals(plus)) {
            System.out.println("Rezultat: "+(a+b));
        }
        if (operator.equals(minus)) {
            System.out.println("Rezultat: " +(a-b));
        }
        if (operator.equals(puta)) {
            System.out.println("Rezultat: " +(a*b));
        }
        if (operator.equals(podeljeno)) {
            System.out.println("Rezultat: " +(a/b));
        }

        System.out.println("KRAJ");
    }
}
