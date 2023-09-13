package d12_09_2023;

public class Domaci3 {
    public static void main(String[] args) {
        Racun racun1 = new Racun ("170-289328923-23", "Marko Markovic", 10000);
        Racun racun2 = new Racun("170-289328555-75", "Sonja Markovic", 5000);


        Transakcija transakcija = new Transakcija (551, racun1, racun2);

        transakcija.izvrsiTransakciju(2000);

        racun1.stampaj();
        racun2.stampaj();

    }

}
