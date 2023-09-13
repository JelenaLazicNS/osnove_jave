package d12_09_2023;

import p12_09_2023.Sastojak;

import java.util.ArrayList;
import java.util.List;

public class Domaci2 {
    public static void main(String[] args) {

        ArrayList<ZeleniKarton> lista = new ArrayList<>();
        lista.add(new ZeleniKarton("Jovan Jovanovic", "12345", "Osnove masinstva", "Aleksandar Cosic", 8));
        lista.add(new ZeleniKarton("Petar Petrovic", "54321", "Pedagogija", "Zoran Zelenovic", 7));
        lista.add(new ZeleniKarton("Sava Savic", "98765", "Projektno upravljanje", "Petar Savkic", 6));
        lista.add(new ZeleniKarton("Zoran Zoric", "56789", "Inzenjertvo materijala", "Julijana Boric", 5));
        lista.add(new ZeleniKarton("Slavica Slavkovic", "55544", "Fizicka hemija", "Snezana Petrovic", 10));


        for (int i = 0; i< lista.size(); i++) {
            lista.get(i).stampaj();
               }

        }
    }



