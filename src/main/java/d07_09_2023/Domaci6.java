package d07_09_2023;

public class Domaci6 {
    public static void main(String[] args) {

        Vozila prvoVozilo = new Vozila();
        prvoVozilo.marka = "VW";
        prvoVozilo.model = "Golf";
        prvoVozilo.regOznaka = "BG1234MM";
        prvoVozilo.godinaProizv = 2020;

        Vozila drugoVozilo = new Vozila();
        drugoVozilo.marka = "Opel";
        drugoVozilo.model = "Corsa";
        drugoVozilo.regOznaka = "NS254KL";
        drugoVozilo.godinaProizv = 2010;

        Vozaci prviVozac = new Vozaci();
        prviVozac.imePrezime = "Sava Petrovic";
        prviVozac.jmbg = "1212055442288";
        prviVozac.brDozvole = 228355;
        prviVozac.datumIsteka = "20.12.2025.";

        Vozaci drugiVozac = new Vozaci();
        drugiVozac.imePrezime = "Marko Zivkovic";
        drugiVozac.jmbg = "0102033558844";
        drugiVozac.brDozvole = 568497;
        drugiVozac.datumIsteka = "05.10.2028.";

        Ruta prvaRuta = new Ruta();
        prvaRuta.polaznaTacka = "Beograd";
        prvaRuta.odrediste = "Novi Sad";
        prvaRuta.duzinaRute = 80;
        prvaRuta.ocekivanoVremePutovanja = "1h_30min";

        Ruta drugaRuta = new Ruta();
        drugaRuta.polaznaTacka = "Novi Sad";
        drugaRuta.odrediste = "Subotica";
        drugaRuta.duzinaRute = 120;
        drugaRuta.ocekivanoVremePutovanja = "2h";



    }
}
