package d15_08_2023;

public class Domaci5 {
    public static void main(String[] args) {

        int a = 0, obimTrougla = 0;
        double povTrougla = 0;
        double KB3 = 1.73;

        a = 10;
        povTrougla = a*a*KB3/4;
        obimTrougla = 3*a;

        System.out.println("a: " +a);
        System.out.println("Povrsina je " +povTrougla);
        System.out.println("Obim je " +obimTrougla);
    }
}
