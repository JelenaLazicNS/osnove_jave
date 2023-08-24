package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);


        System.out.println("Unesite poziciju: ");
        int a = s.nextInt();
        int x = 0;

        x = numbers.get(a);
        System.out.println("Na poziciji "+a+" je vrednost " +x);


    }
}
