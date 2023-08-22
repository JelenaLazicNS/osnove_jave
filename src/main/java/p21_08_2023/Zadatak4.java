package p21_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

        int osnova = 2;
        int stepen = 7;
        int prod = 1;

        for (int i =0; i<7; i++) {
            prod = prod * osnova;
        }
        System.out.println(stepen + " stepen broja "+osnova+"  je " +prod);
    }
}

