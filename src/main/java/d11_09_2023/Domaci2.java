package d11_09_2023;

public class Domaci2 {
    public static void main(String[] args) {

        FacebookPost post1 = new FacebookPost("lalala", "Pera", "Peric");
        Korisnik korisnik1 = new Korisnik("Pera", "Peric");


        post1.setKorisnik(korisnik1);
        post1.stampaj();

    }

}
