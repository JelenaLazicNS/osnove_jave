package d18_08_2023;

import java.util.Scanner;

public class Domaci4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Pocetak");
        //_ _ _ _ _
        //_ _ _ _ _
        //_ _ _ _ _
        //_ _ _ _ _
        //_ _ _ _ _

        for (int i=1; i<=5; i++) {
            for (int x=1; x<=5; x++)
               if (x==5) {
                System.out.println("_");
               }else {
                System.out.print("_ ");
            }
        }

        System.out.println("Kraj");
    }
}
