package p19_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        PoreskaUprava p = new PoreskaUprava("Novi Sad");

        p.dodajObjekat (new Kuca("Kraljevica Marka", 125, 2, 4));
        p.dodajObjekat(new Zgrada("Bulevar Oslobodjenja", 220, 1, 5));
        p.dodajObjekat(new Lokal("Kosovska", 250, 3));
        p.dodajObjekat(new Zgrada("Masarikova", 300, 2, 2));

        System.out.println("Ukupan porez za ceo grad je: "+p.ukupanPorez());
        p.stampajSve();
        System.out.println("Objekat sa najvecim porezom je: ");
        Objekat najveciPorez = p.najveciPorez();
        najveciPorez.stampaj();
    }


    }

