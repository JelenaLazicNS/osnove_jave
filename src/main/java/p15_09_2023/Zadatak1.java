package p15_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Studenti a = new Studenti();
        a.setImePrezime("Marko Markovic");
        a.setJmbg("5435436543564");
        a.setBrIndexa("225/23");
        a.setDugSkolarina(10000);
        a.stampaj();
        a.uplatiSkolarinu(50);

        Studenti b = new Studenti();
        b.setImePrezime("Petar Petrovic");
        b.setJmbg("5436584354763");
        b.setBrIndexa("122/23");
        b.setDugSkolarina(5000);
        b.stampaj();
        b.uplatiSkolarinu(100);

        Studenti marko = new Studenti("Marko Markovic", "3254354", "55/22", 1000);
        marko.uplatiSkolarinu(500);
        Studenti petar = new Studenti("Petar Petrovic", "354354", "44/22", 2000);
        petar.uplatiSkolarinu(200);

        Profesor prof1 = new Profesor();
        prof1.setImePrezime("Slobodan Jovic");
        prof1.setJmbg("63583543");
        prof1.setNazivPredmeta("Biologija");
        prof1.setIznosPlate(50000);
        prof1.stampaj();
        prof1.povecajPlatu(5);

        Profesor prof2 = new Profesor();
        prof2.setImePrezime("Goran panic");
        prof2.setJmbg("685344378");
        prof2.setNazivPredmeta("Geografija");
        prof2.setIznosPlate(60000);
        prof2.stampaj();
        prof2.povecajPlatu(2);



    }
}
