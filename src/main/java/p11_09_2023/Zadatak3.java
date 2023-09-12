package p11_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Reziser reziser = new Reziser("Carls ", 50);
        Film film = new Film("Lesi", 2005,reziser );

        film.setReziser(reziser);

        film.stampaj();



        reziser.stampaj();


    }
}
