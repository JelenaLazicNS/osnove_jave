package p21_08_2023;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite password: ");
        String passw = s.next();
        System.out.print("Skriveni pasvord: ");
        int brojac = passw.length();
        String skriveni = "";

        for (int i = 0; i< brojac; i++){
            System.out.print("*");
        }


    }
}
