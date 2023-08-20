package d18_08_2023;

import java.util.Scanner;

public class Domaci3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Pocetak");
        //Unesite x: 5
        //5 x 1 = 5
        //5 x 2 = 10
        //5 x 3 = 15
        //5 x 4 = 20
        //5 x 5 = 25
        //5 x 6 = 30
        //5 x 7 = 35
        //5 x 8 = 40
        //5 x 9 = 45

        System.out.print("Unesite x: ");
        int x = s.nextInt();

        for (int i=1; i<=9; i++) {
            System.out.println(x+ " x "+i+" = "+x*i);
        }

        System.out.println("Kraj");
    }
}
