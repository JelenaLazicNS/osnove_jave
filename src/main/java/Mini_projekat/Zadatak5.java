package Mini_projekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Zadatak5 {
    public static void main(String[] args) {
        //generisiRandomKarakter: Ova metoda generiše i vraća random karakter.
        // Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve
        // (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost
        // (string). Ova metoda nema ulazne parametre.
        //generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter.
        // Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima).
        // Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.


        Random random = new Random();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite zeljenu duzinu passworda: ");
        int duzina = s.nextInt();
        System.out.println("Da li želite da sadrži specijalan karakter (true/false): ");
        boolean specKarakter = s.nextBoolean();


        System.out.println(generisanPassword(duzina, specKarakter));

    }
    public static String generisanPassword (int duzina, boolean specKarakter) {

        String niz = "";
        if (specKarakter == true) {
            duzina = duzina - 1;
            for (int i = 0; i < duzina; i++) {
                niz = niz + randomLetter();
            }
            niz = niz + specCharacter();
        } else {
            for (int i = 0; i < duzina; i++) {
                niz = niz + randomLetter();
            }
        }
        return niz;
    }

        public static String randomLetter (){
            Random random = new Random();
            String b = "";
            ArrayList<String> karakter = new ArrayList<>();
            karakter.add("A");karakter.add("a");karakter.add("B");karakter.add("b");karakter.add("C");karakter.add("c");karakter.add("D");karakter.add("d");karakter.add("E");karakter.add("e");
            karakter.add("F");karakter.add("f");karakter.add("G");karakter.add("g");karakter.add("H");karakter.add("h");karakter.add("I");karakter.add("i");karakter.add("J");karakter.add("j");
            karakter.add("K");karakter.add("k");karakter.add("L");karakter.add("l");karakter.add("M");karakter.add("m");karakter.add("N");karakter.add("n");karakter.add("O");karakter.add("o");
            karakter.add("P");karakter.add("p");karakter.add("Q");karakter.add("q");karakter.add("R");karakter.add("r");karakter.add("S");karakter.add("s");karakter.add("T");karakter.add("t");
            karakter.add("U");karakter.add("u");karakter.add("V");karakter.add("v");karakter.add("W");karakter.add("w");karakter.add("X");karakter.add("x");karakter.add("Y");karakter.add("y");

            return b = karakter.get(random.nextInt(karakter.size()));



        }
        public static String specCharacter(){
            Random random = new Random();
            String x = "";
            ArrayList<String> specKarakter = new ArrayList<>();
            specKarakter.add("#");specKarakter.add("%");specKarakter.add("!");specKarakter.add("&");specKarakter.add("?");specKarakter.add("@");
            return x = specKarakter.get(random.nextInt(specKarakter.size()));
        }


    }

