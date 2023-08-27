package p25_08_2023;

import java.util.Scanner;
import java.util.ArrayList;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite M: ");
        int M = s.nextInt();

        for (int i=1; i<=M; i++) {
            printStars(i);
        }
    }
    public static void printStars (int n) {
        for (int i=0; i<n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}

