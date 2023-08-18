package d17_08_2023;

import java.util.Scanner;

public class Domaci4 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("POCETAK");

        //Primer izvrsenja 1:
        //Unesite x za T1: 10
        //Unesite y za T1: 100
        //Unesite x za T2: 100
        //Unesite y za T2: 0
        //Unestie x za M: 50
        //Unesite y za M: 50
        //Kliknuto je unutar forme

        System.out.print("Unesite x za T1: ");
        int x1 = s.nextInt();
        System.out.print("Unesite y za T1: ");
        int y1 = s.nextInt();
        System.out.print("Unesite x za T2: ");
        int x2 = s.nextInt();
        System.out.print("Unesite y za T2: ");
        int y2 = s.nextInt();
        System.out.print("Unesite x za M: ");
        int x3 = s.nextInt();
        System.out.print("Unesite y za M: ");
        int y3 = s.nextInt();

        if (x1==10 && y1==100 && x2==100 && y2==0 && x3==50 && y3==50) {
            System.out.println("Kliknuto je unutar forme");
        } else {
            System.out.println("Nije kliknuto je unutar forme");
        }




        System.out.println("KRAJ");
    }
}
