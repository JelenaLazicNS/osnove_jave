package p21_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {


        String niz = "";
        String res = "...";
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                niz = niz + i;
            } else {
                niz = i+niz;
            }

        } System.out.println(res);
        System.out.print(niz);



        }
    }

