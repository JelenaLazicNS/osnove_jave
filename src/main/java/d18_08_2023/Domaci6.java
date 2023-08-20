package d18_08_2023;

import java.util.Scanner;

public class Domaci6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Pocetak");
        //Unesite dimenziju table: 5
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|

        System.out.println("Unesite dimenziju table: ");
        int dimenz=s.nextInt();

        for (int i = 1; i <= dimenz; i++) {
            for (int x = 1; x <= 5; x++)
                if (x == 5) {
                    System.out.println("_|");
                } else {
                    System.out.print("_| ");


                }
        }System.out.println("Kraj");
    }
}
