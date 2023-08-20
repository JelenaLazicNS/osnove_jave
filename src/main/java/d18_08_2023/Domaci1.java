package d18_08_2023;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {

        int y = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Pocetak");
        //Primer izvrsenja 1:
        //Unesite x: -3
        //y = -3
        //Ako je x manje od 2, y je jednako x
        //Ako je x u opsegu od 2 do 10, y je jednako 2
        //Ako je x vece od 10, y je x-1

        System.out.println("Unesite x: ");
        int x = s.nextInt();

        if (x < 2) {
            y = x;

        } else if (x >= 2 && x < 10) {
            y = 2;

        } else if (x >= 10)
            y = x-1;
        {
            System.out.println("y: "+y);

        }System.out.println("Kraj");
    }
}
