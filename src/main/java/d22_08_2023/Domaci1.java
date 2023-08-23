package d22_08_2023;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//Napisati program koji sabira brojeve koje korisnik unosi,
// pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//Unesite vrednost: 20
//Unesite vrednost: 50
//Unesite vrednost: 50
//Prekoracenje! Kraj programa. Sracunata suma je 70.
        int suma = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("Unesite vrednost: ");
            int x = s.nextInt();

            if ((suma + x)>100) {
                System.out.println("Prekoracenje! Kraj programa.");
                valid = true;
            } else {
                suma = suma + x;
                System.out.println("Suma je: "+suma);
            }
        }

    }
}
