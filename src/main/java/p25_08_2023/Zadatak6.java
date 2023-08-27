package p25_08_2023;

public class Zadatak6 {
    public static void main(String[] args) {

        int m = 10;
        int n =-4;

        int p = obrni(m);
        int q = obrni(n);

        System.out.println("M "+m+", P" + p);
        System.out.println("N "+n+", Q" + q);

    }
    public static int obrni(int n) {
        int x = n * -1;
        return (x);

    }
}
