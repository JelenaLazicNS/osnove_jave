package p08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Auto auto = new Auto();
        auto.vozac = "Pera Peric";
        auto.marka = "VW";
        auto.brojVrata = 5;
        auto.potrosnjaNa100km = 5.4;
        auto.trenutnaBrzina = 100;
        auto.marka = "BMW";
        auto.kubikaza = 2000;
        auto.registrovanDo = 8;
        auto.godinaProizvodnje = 1940;
        auto.registracija = "NI125KK";
        auto.ukljucenaKlima = true;
        auto.maxBrzina = 240;

        auto.stampaj();

        int ogranicenjeNaPutu = 130;
        int trenutniMesec = 9;

        auto.stampaj();

        if (auto.jePrekoracio(ogranicenjeNaPutu)) {
            System.out.println("Auto je prekoracio brzinu. Novcana kazna je: "+ auto.novcanaKazna(ogranicenjeNaPutu));
        } else {
            System.out.println("Nije prekoracio brzinu.");
        }

        if (auto.odlTimer()) {
            System.out.println("Auto je old timer.");
        }

        if (auto.registrovanDo(9)) {
            System.out.println("Jos uvek vazi registracija");
        } else {
            System.out.println("Registracija je istekla");
        }

        System.out.println("Cena registracije "+ auto.cenaRegistracije());

        auto.dodajgas();
        auto.dodajgas();
        auto.dodajgas();
        auto.dodajgas();
        auto.dodajgas();
        auto.dodajgas();
        auto.dodajgas();
        auto.dodajgas();
        auto.dodajgas();
        auto.dodajgas();
        auto.dodajgas();
        auto.dodajgas();
        auto.dodajgas();
        auto.dodajgas();

        auto.koci();

        System.out.println("Trenutna potrosnja "+ auto.trenutnaPotrosnja());

        auto.stampajTablu();
    }
}
