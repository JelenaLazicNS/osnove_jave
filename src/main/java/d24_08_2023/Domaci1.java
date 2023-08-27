package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
        //Unesite pozicjiu od 0 do 9: 3
        //Unesite novu vrednost: 11

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite poziciju od 0 do 9: ");
        int pozicija = s.nextInt();
        System.out.println("Unesite novu vrednost: ");
        int novaVrednost = s.nextInt();

        numbers.set(pozicija, novaVrednost);

        System.out.println(numbers);

    }
}
