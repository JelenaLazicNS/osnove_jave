package d21_08_2023;

import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//Unesite broj: 1
//Unesite broj: 32
//Unesite broj: 121
//Unesite broj: 1333
//Unesite broj: 144
//Suma je: 265

        System.out.print("Unesite N ");
        int N = s.nextInt();
        int suma = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Unesite broj ");
            int broj = s.nextInt();
            if (broj/100>0 && broj/100<10) {
                suma = suma + broj;
            }
        }
        System.out.println("Suma je " +suma);
    }
}
