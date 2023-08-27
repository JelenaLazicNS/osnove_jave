package d25_08_2023;

public class Domaci2 {
    public static void main(String[] args) {
        //ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
        //ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        int spojeniBrojevi = spojeniBrojevi(2, 3);
        System.out.println((spojeniBrojevi));

    }
    public static int spojeniBrojevi(int a, int b) {
        return a*10+b;
    }
}
