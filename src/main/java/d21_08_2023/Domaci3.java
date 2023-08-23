package d21_08_2023;

import java.util.Scanner;

public class Domaci3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Unesite N: 5
        //	Unesite tekst: Cao!
        //	Cao!
        //	Unesite tekst: Hello
        //	Hello!
        //	Unesite tekst: Hi!
        //	Hi!
        //	Unesite tekst: Cuti
        //	Cuti!
        //	Unesite tekst: Ajde!
        //	Ajde!
        //	Nivo agresivnosti 60.
        //	(Objasnjenje, 60% jer je od 5 unetih reci, 3 bilo sa !)

        System.out.print("Unesite N ");
        int N = s.nextInt();
        int brojac = 0;

        for (int i = 0; i<N; i++) {
            System.out.println("Unesite rec: ");
            String rec = s.next();
            if (rec.contains("!")){
                System.out.println(rec);
                brojac = brojac + 1;
            } else {
                System.out.println(rec+ "!");
            }
        } int agresivnost = brojac*100/N;
        System.out.println("Nivo agresivnosti: " +agresivnost
        );
    }
}
