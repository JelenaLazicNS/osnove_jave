package d08_09_2023;

public class Domaci1 {
    public static void main(String[] args) {

        Proizvodi proizvodA = new Proizvodi();
        proizvodA.naziv = "Bombone";
        proizvodA.cena = 800;
        proizvodA.tezinaGr = 500;

        Proizvodi proizvodB = new Proizvodi();
        proizvodB.naziv = "Keks";
        proizvodB.cena = 600;
        proizvodB.tezinaGr = 150;

        proizvodA.stampaj();
        proizvodB.stampaj();

        proizvodA.povecajCenu(150.5);
        proizvodB.povecajCenu(80.6);

        proizvodA.stampaj();
        proizvodB.stampaj();

        proizvodA.vratiCenuSaPopustom(10);
        proizvodB.vratiCenuSaPopustom(10);

        proizvodA.stampaj();
        proizvodB.stampaj();

        System.out.println("Postarina za "+proizvodA.naziv+" je "+proizvodA.racunajPostarinu()+" din.");
        System.out.println("Postarina za "+proizvodB.naziv+" je "+proizvodB.racunajPostarinu()+" din.");






    }
}
