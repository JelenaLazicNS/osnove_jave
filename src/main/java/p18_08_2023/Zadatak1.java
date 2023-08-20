package p18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Ukoliko se za operaciju unese uvecaj, to uvecava promenljivu N za 1.
        //Ukoliko se za operaciju unese smanji, to smanjuje promenljivu N za 1.

        System.out.println("POCETAK");

        System.out.println("Unesi vrednost za broj N: ");
        int N = s.nextInt();
        System.out.println("Unesi akciju: ");
        String akcija = s.next();


        if (akcija.equals("uvecaj")) {
            N=N+1;
        }

        if (akcija.equals("smanji")) {
            N=N-1;
        }

        System.out.println("N je: "+N); //ovako ce stampati koji god ishod da bude

        System.out.println("KRAJ");
    }
}
