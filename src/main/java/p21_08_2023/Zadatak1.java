package p21_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        int suma = 0;
        for (int i = 1; i<= 50; i++) {
            if(i % 2 == 0) {
                suma = suma + i;

            }

        }System.out.println("Suma "+suma);
    }
}
