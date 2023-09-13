package p12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {


        Kartica superKartica = new Kartica(10, "9329-0239");
        superKartica.setBrKartice("635435-35435");

        int x = superKartica.getPopust()*100;
        superKartica.setPopust(10);

        Kupac kupac1 = new Kupac("Petar Jovanovic", superKartica);

        Kartica k = kupac1.getKartica();
        System.out.println(k.getPopust());

        System.out.println(kupac1.getKartica().getPopust());

        Proizvod kafa = new Proizvod("Grand Kafa 100g", 100);
        kafa.setKupac(kupac1);
        kafa.stampaj();








    }
}
