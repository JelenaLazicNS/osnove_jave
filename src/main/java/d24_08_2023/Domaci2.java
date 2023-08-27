package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 4
//Unesite broj: 7
//Unesite broj: 8
//U nizu ima 2 parna broja.


        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int nizBrojeva = s.nextInt();

        int parniBrojevi = 0;

        for (int i = 0; i < nizBrojeva; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            numbers.add(broj);
        }
        for (int i=0; i< numbers.size(); i++){
            if (numbers.get(i)%2 ==0){
                parniBrojevi++;
            }

        }

        System.out.println("U nizu ima "+parniBrojevi+ " parna broja");
    }



}
