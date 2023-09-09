package d07_09_2023;



public class Domaci1 {
    public static void main(String[] args) {


        Studenti a = new Studenti();
        a.ime = "Stefan Petrovic";
        a.brojIndexa = 255;
        a.fakultet = "Tehnoloski fakultet u Novom Sadu";

        Studenti b = new Studenti();
        b.ime = "Marija Savic";
        b.brojIndexa = 122;
        b.fakultet = "Masinski fakultet u Nisu";

        Studenti c = new Studenti();
        c.ime = "Svetlana Todorovic";
        c.brojIndexa = 347;
        c.fakultet = "Medicinski fakultet u Beogradu";

        System.out.println("Ime studenta: "+a.ime+", broj indexa: "+a.brojIndexa+", naziv fakulteta: "+a.fakultet);
        System.out.println("Ime studenta: "+b.ime+", broj indexa: "+b.brojIndexa+", naziv fakulteta: "+b.fakultet);
        System.out.println("Ime studenta: "+c.ime+", broj indexa: "+c.brojIndexa+", naziv fakulteta: "+c.fakultet);
    }
}
