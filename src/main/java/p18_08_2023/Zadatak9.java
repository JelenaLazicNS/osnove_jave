package p18_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();

        for (int i=1; i<=10; i++){
            if (i != a && i != b) {
                System.out.print(i +", ");
            } else {
                System.out.println("_ ");
            }

        }
        System.out.print("=> (objasnjenje: 3 i 5 nisu odstampani)");
    }
}
