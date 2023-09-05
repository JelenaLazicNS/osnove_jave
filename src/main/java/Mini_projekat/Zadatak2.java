package Mini_projekat;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

        //Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
        //Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan.
        // Informacije o aktivnostima biće čuvane u nizu gde će za svakog korisnika biti zabeleženo
        // da li je trenutno aktivan ili ne  (true ili false)..
        // Naravno, korisnik i njegova aktivnost će biti upareni po istom indeksu.
        // To znači da će se za korisnika na poziciji N u nizu "korisnici" čitati aktivnost sa
        // pozicije N u nizu "aktivnosti".
        //Program će ispisivati informacije za svakog korisnika na sledeći način:
        //Za aktivne korisnike:
        //  | slika |o Ime Prezime
        //Za neaktivne korisnike:
        //  | slika |x Ime Prezime

        ArrayList<String> fullName = new ArrayList<>();
        fullName.add("Pera Peric");
        fullName.add("Marko Markovic");
        fullName.add("Stefan Stefanovic");
        fullName.add("Milan Milanovic");
        fullName.add("Darko Darkovic");
        fullName.add("Uros Urosevic");


        ArrayList<Boolean> active = new ArrayList<>();
        active.add(true);
        active.add(true);
        active.add(false);
        active.add(true);
        active.add(true);
        active.add(false);


        for (int i =0; i < active.size(); i ++) {
            if (active.get(i) == true) {
                System.out.println("| slika |o " + fullName.get(i));
            } else if (active.get(i) == false) {
                System.out.println("| slika |x " + fullName.get(i));
            }
        }

    }
}






