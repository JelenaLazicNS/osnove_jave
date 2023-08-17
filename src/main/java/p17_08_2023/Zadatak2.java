package p17_08_2023;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Dan: ");
        int dan = s.nextInt();
        System.out.print("Mesec: ");
        int mesec = s.nextInt();
        System.out.print("Godina: ");
        int godina = s.nextInt();

     //   String datum = dan+"-"+mesec+"-"+godina;


        System.out.println(dan+"-"+mesec+"-"+godina);



    }
}
