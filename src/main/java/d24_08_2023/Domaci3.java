package d24_08_2023;

import java.util.ArrayList;

public class Domaci3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);

        for (int i= numbers.size()-1; i>=0; i--) {
            System.out.print(numbers.get(i)+", ");
        }

    }
}
