package p24_08_2023;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Zadatak1 {
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
        int x4 = numbers.get(3);
        int x5 = numbers.get(4);

        int suma = numbers.get(0) + numbers.get(4);

        System.out.println("Suma " +suma);


    }
}
