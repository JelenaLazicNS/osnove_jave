package p21_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N ");
        int N = s.nextInt();
        int suma = 0;

        for (int i=1; i<=N; i++) {
            System.out.print("Unesite broj ");
            int broj = s.nextInt();

                suma=suma +1;

        }
        System.out.println("Suma "+suma);


    }
}
