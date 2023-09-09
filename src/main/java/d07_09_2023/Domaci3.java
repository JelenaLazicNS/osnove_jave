package d07_09_2023;

public class Domaci3 {
    public static void main(String[] args) {

        Proizvodi a = new Proizvodi();
        a.naziv = "Mleko";
        a.cena = 120.45;

        Proizvodi b = new Proizvodi();
        b.naziv = "Vino";
        b.cena = 841.25;

        Proizvodi c = new Proizvodi();
        c.naziv = "Voda";
        c.cena = 52.78;

        System.out.println("Naziv proizvoda: "+a.naziv+", cena: "+a.cena+"rsd");
        System.out.println("Naziv proizvoda: "+b.naziv+", cena: "+b.cena+"rsd");
        System.out.println("Naziv proizvoda: "+c.naziv+", cena: "+c.cena+"rsd");
    }
}
