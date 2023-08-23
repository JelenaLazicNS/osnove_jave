package d22_08_2023;

import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Unesite broj: 3
        //Apsolutna vrednost je 3
        //Unesite broj: -1
        //Apsolutna vrednost je 1
        //Unesite broj: 0
        //Kraj programa jer je uneta nula.
        boolean zero = false;

        while (!zero) {
            System.out.println("Unesite broj: ");
            int x = s.nextInt();

            if (x<0 || x>0) {
                System.out.println("Apsolutna vrednost je " + Math.abs(x));

            } else {
                System.out.println("Kraj programa jer je uneta nula.");
            }
        }
    }
}
