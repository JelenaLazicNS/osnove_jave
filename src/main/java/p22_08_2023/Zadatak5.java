package p22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counter = 0;
//Unesite expected: hello
//	Unesite actual: hello
//Unesite expected: hello1
//	Unesite actual: hello1
//Unesite expected: hello2
//	Unesite actual: hello
//	Test failed: Expected hello2 but got hello.

        while(counter<=5) {
            System.out.println("Unesite expected: ");
            String recE =s.next();
            System.out.println("Unesite actual:");
            String recA =s.next();

            if(recA.equals(recE)) {
                counter = counter+1;
            }
            else if (!recA.equals(recE)) {
                System.out.println("Test failed: Expected " +recE+" but got "+recA);
            } else {
                System.out.println("Test passed");
            }
        }
    }
}
