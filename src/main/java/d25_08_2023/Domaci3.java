package d25_08_2023;

public class Domaci3 {
    public static void main(String[] args) {
        //JMBG: [jmbg]
        //Ime: [ime]
        //Prezime: [prezime]
        //God. rodjenja: [god]
        //Aktivan: [true/false]
        //Metoda prima jmbg, ime, prezime,
        // god rodjenja i da li je aktivan kao parametre metode.

        podaciKorisnika("1502955800055", "Marko", "Markovic", 1955, true);
    }
    public static void podaciKorisnika(String jmbg, String ime, String prezime,
                                       int godRodj, boolean isActive) {
        System.out.println("JMBG: "+jmbg);
        System.out.println("Ime: "+ime);
        System.out.println("Prezime: "+prezime);
        System.out.println("God.rodjenja: "+godRodj);
        System.out.println("Aktivan: "+isActive);
    }
}
