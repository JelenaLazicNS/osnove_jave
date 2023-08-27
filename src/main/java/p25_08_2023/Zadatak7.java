package p25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {

        int x = 3, y = 4, z = 5;
        boolean t = daLiJePravougli(x, y, z);
        if (t = true) {
            System.out.println("pravougli");
        } else {
            System.out.println("nije pravougli");
        }
    }

    public static boolean daLiJePravougli(int a, int b, int c) {
        boolean trougli = true;
        if (a * a + b * b == c * c) {
            trougli = true;
        } else {
            trougli = false;
        }
        return trougli;
    }


}


