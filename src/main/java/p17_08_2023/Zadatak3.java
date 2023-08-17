package p17_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("a = ");
        double a = s.nextDouble();
        System.out.print("b = ");
        double b = s.nextDouble();
        System.out.print("c = ");
        double c = s.nextDouble();

        double d = (a+b+c)/3;

        System.out.println("Srednja vrednost tri broja: "+d);


    }
}
