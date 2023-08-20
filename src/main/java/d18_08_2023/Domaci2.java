package d18_08_2023;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Pocetak");

       //Unesite ime: Milan
        //Unesite prezime: Jovanovic
        //Unesite jmbg: 2109238932232
        //Unesite broj primeraka za stampu: 3
        //
        //Primerak 1
        //**********************************
        //Ime i prezime: Milan Jovanovic
        //JMBG: 2109238932232
        //**********************************
        //
        //Primerak 2
        //**********************************
        //Ime i prezime: Milan Jovanovic
        //JMBG: 2109238932232
        //**********************************
        //
        //Primerak 3
        //**********************************
        //Ime i prezime: Milan Jovanovic
        //JMBG: 2109238932232
        //**********************************

        System.out.print("Unesite ime: ");
        String ime=s.next();
        System.out.print("Unesite prezime: ");
        String prezime=s.next();
        System.out.print("Unesite jmbg: ");
        String jmbg=s.next();
        System.out.print("Unesite broj primeraka za stampu: ");
        int broj=s.nextInt();

        for (int i=1; i<=broj; i++) {


            System.out.println();
            System.out.println("Primerak "+ i);
            System.out.println("******************************");
            System.out.println("Ime i prezime: "+ime +" "+ prezime);
            System.out.println("JMBG: "+jmbg);
            System.out.println("******************************");
        }




        System.out.println("Kraj");
    }
}
