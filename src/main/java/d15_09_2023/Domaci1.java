package d15_09_2023;
import java.util.ArrayList;
import java.util.Scanner;


public class Domaci1 {
    public static void main(String[] args) {

        Igrac igrac1 = new Igrac("Petar Petrovic", "3546354363654", 2000, 15,  "Odbrambeni", true);
        Igrac igrac2 = new Igrac("Marko Markovic", "325435436453", 2001, 10,  "Napadac", false);

        Trener trener1 = new Trener("Zoran Stankovic", "354354133435", 1980, 10, "Kondicioni");
        Trener trener2 = new Trener("Milovan Stevic", "63743543654", 1990, 10, "Kondicioni");

        igrac1.stampaj();
        igrac2.stampaj();

        trener1.stampaj();
        trener2.stampaj();

        Scanner s = new Scanner(System.in);

        ArrayList<Igrac> igraci = new ArrayList<>();
        System.out.print("Unesite ukupan broj igraca: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            Igrac igrac = new Igrac();
            System.out.print("Unesite puno ime igraca: ");
            igrac.setImePrezime(s.next());

            System.out.print("Unesite jmbg igraca: ");
            igrac.setJmbg(s.next());

            System.out.print("Unesite godinu rodjenja: ");
            igrac.setGodRodjenja(s.nextInt());

            System.out.print("Unesite broj dresa: ");
            igrac.setBrDresa(s.nextInt());

            System.out.print("Unesite poziciju: ");
            igrac.setPozicija(s.next());

            System.out.print("Da li je igrac kapetan tima: ");
            igrac.setKapiten(s.nextBoolean());

            igraci.add(igrac);


    ArrayList<Trener> treneri = new ArrayList<>();
        System.out.print("Unesite ukupan broj trenera: ");
        int m = s.nextInt();

        for (i = 0; i < m; i++) {

        Trener trener = new Trener();
        System.out.print("Unesite puno ime trenera: ");
        trener.setImePrezime(s.next());

        System.out.print("Unesite jmbg trenera: ");
        trener.setJmbg(s.next());

        System.out.print("Unesite godinu rodjenja: ");
        trener.setGodRodjenja(s.nextInt());

       // System.out.print("Unesite godine iskustva: ");
        //trener.setGodIskustva(s.nextInt());

        //System.out.print("Unesite tip trenera: ");
        //trener.setTipTrenera(s.next());

        treneri.add(trener);
    }

        for (i = 0; i < igraci.size(); i++) {
        igraci.get(i).stampaj();
    }

        for (i = 0; i < treneri.size(); i++) {
        treneri.get(i).stampaj();
    }
}

}
}
