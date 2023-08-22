package p21_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N ");
        int N = s.nextInt();
        int ispis = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Unesite broj ");
            int broj = s.nextInt();
            ispis = ispis*10 + broj;

        }System.out.println("Suma je "+ispis);
    }
}
