package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        System.out.println(numbers);
        int sum = 0;

        for (int i=0; i<numbers.size(); i++) {
            sum=sum+ numbers.get(i);
        } System.out.println("Suma: "+ sum );
    }
}
