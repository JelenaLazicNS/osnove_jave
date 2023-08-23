package p22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:0
        //Unesite broj:1
        //Unesite broj:0
        //Kraj programa jer je uneto 2 nule.

        int zeroCounter = 0;

        while (zeroCounter<2) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj==0) {
                zeroCounter++;
            }
            System.out.println("Kraj jer su unete dve nule");
            }
        }

    }




