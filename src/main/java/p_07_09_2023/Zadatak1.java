package p_07_09_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        Racun a = new Racun();
        a.brojRacuna = "840-555-33";
        a.imeVlasnika = "Petar";
        a.prezimeVlasnika = "Petrovic";
        a.stanjeRacuna = 700;


        Racun b = new Racun();
        b.brojRacuna = "841-5055-33";
        b.imeVlasnika = "Marko";
        b.prezimeVlasnika = "Markovic";
        b.stanjeRacuna = 200;

        System.out.println("Posiljalac: "+a.imeVlasnika+" "+a.prezimeVlasnika+", "+ a.brojRacuna+", "+ a.stanjeRacuna);
        System.out.println("Primalac: "+b.imeVlasnika+" "+b.prezimeVlasnika+", "+ b.brojRacuna+", "+ b.stanjeRacuna);
        System.out.println("Unesite sumu za transakciju:");
        int x = s.nextInt();


        a.stanjeRacuna = a.stanjeRacuna - x;

        b.stanjeRacuna = b.stanjeRacuna + x;

        System.out.println("Stanje nakon transakcije:");
        System.out.println("Posiljalac: "+a.imeVlasnika+" "+a.prezimeVlasnika+", "+ a.brojRacuna+", "+ a.stanjeRacuna);
        System.out.println("Primalac: "+b.imeVlasnika+" "+b.prezimeVlasnika+", "+ b.brojRacuna+", "+ b.stanjeRacuna);
    }


}
