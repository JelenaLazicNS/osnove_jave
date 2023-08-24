package p24_08_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        int x1 = numbers.get(0);
        int x2 = numbers.get(1);
        int x3 = numbers.get(2);
        int x4 = numbers.get(3); //index = 3-na cetvrtoj poziciji, treci element = 2
        int x5 = numbers.get(4);


        x4 = x4 * 10;

        numbers.set(3,x4);
        System.out.println("Nova vrednost: " +x4);
    }




}
