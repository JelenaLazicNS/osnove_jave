package d22_08_2023;

import java.util.Scanner;

public class Domaci4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:0
        //Unesite broj:2
        //Kraj programa.
        //(Objasnjenje: Kraj jer je uneto dve dvojke)
        int counterOne = 0;
        int counterTwo = 0;
        boolean kraj = false;

        while (!kraj) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj==1) {
                counterOne++;
            } else if (broj == 2) {
                counterTwo++;
            }

            if (counterOne>=3) {
                kraj = true;
                System.out.println("Kraj jer su unete tri jedinice");
            } else if (counterTwo>=2) {
                kraj = true;
                System.out.println("Kraj jer su unete dve dvojke");
            }
            }

        }
    }
