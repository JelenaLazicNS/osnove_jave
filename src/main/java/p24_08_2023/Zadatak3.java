package p24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);


        int a = numbers.get(0);
        int b = numbers.get(4);


        numbers.set(0, b);
        numbers.set(4, a);

        System.out.println(numbers);
    }
}
// int last = numbers.get(numbers.size()-1);
//int first= numbers.get(0);
// numbers.set(0, last);
// numbers.set(numbers.size()-1, first);