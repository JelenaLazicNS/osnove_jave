package d25_08_2023;

public class Domaci6 {
    public static void main(String[] args) {
        //Primer izvrsenja:
        //izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
        //izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

        System.out.println(brojac(5, 10));
        System.out.println(brojac(-5, 1));
    }

    public static int brojac(int a, int b) {
        int brojac = 0;
            for (int i =a; i < b; i++) {
                brojac++;
            }
            return brojac;
        }


    }
