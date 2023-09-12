package p11_09_2023;

public class Zadatak4 {
    public static void main(String[] args) {

        Film film = new Film("Lesi", 1960);
        Reziser reziser = new Reziser("Charls", 50);

        film.setReziser(reziser);
        film.stampaj();

    }
}
