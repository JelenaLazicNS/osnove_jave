package p14_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {


        Pasta pasta1 = new Pasta();

        Sastojak sastojak1 = new Sastojak("spagete", 180.0);
        Sastojak sastojak2 = new Sastojak("paradajz", 120.0);
        Sastojak sastojak3 = new Sastojak("bosiljak", 85.0);


        pasta1.dodajSastojak(sastojak1);
        pasta1.dodajSastojak(sastojak2);
        pasta1.dodajSastojak(sastojak3);

        pasta1.stampaj();
    }
}
