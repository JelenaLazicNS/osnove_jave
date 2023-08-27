package d25_08_2023;

public class Domaci7 {
    public static void main(String[] args) {
        //Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
        //Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4

        int broj1 = 4;
        int broj2 = 6;
        int broj3 = 1;
        System.out.println("Najmanji broj izmedju "+broj1+", "+broj2+" i "+broj3+" je "+min(broj1, broj2, broj3));
    }
    public static int min (int a, int b, int c) {
        if (a<b && a<c)
            return a;
        else if (b<a && b<c)
            return b;
        else return c;
    }
}
