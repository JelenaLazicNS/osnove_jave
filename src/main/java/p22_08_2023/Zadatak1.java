package p22_08_2023;

import java.util.Scanner;
import java.util.SortedMap;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Unesite broj: 5
        //Greska: Broj nije u opsegu od 10 do 50.
        //Unesite broj: -1
        //Greska: Broj nije u opsegu od 10 do 50.
        //Unesite broj: 51
        //Greska: Broj nije u opsegu od 10 do 50.
        //Unesite broj: 40
        //KRAJ

        System.out.println("Unesite broj: ");
        int broj = s.nextInt();

        while (broj<10 || broj>50) {
            System.out.println("Greska: broj nije u opsegu od 10 do 50");
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
        }
        System.out.println("Kraj");

    }
}
