package d19_09_2023;

public class Domaci1 {
    public static void main(String[] args) {
        Korpa korpa = new Korpa();
        SuperKartica kartica = new SuperKartica(222, "Sava Savic", 20);
        StaklenaAmbalaza ambalaza = new StaklenaAmbalaza("6847653", "Pivo", 500, 900, 100, false, 150);

        korpa.dodajAmbalazu(new Tetrapak("3654635", "Mleko", 1000, 260, true, 100));
        korpa.dodajAmbalazu(new StaklenaAmbalaza("638764", "Vino", 750, 1500, 100, true, 120));
        korpa.dodajAmbalazu(new Tetrapak("63546354", "Sok", 1000, 1250, false, 250));
        korpa.dodajAmbalazu(ambalaza);

        System.out.println(korpa.ukupnaCenaKorpe(kartica));
        System.out.println(ambalaza.cena());


        for (int i = 0; i < korpa.getAmbalaze().size(); i++) {
            korpa.getAmbalaze().get(i).stampaj();
        }
    }
}
