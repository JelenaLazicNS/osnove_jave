package p25_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {

        int a = konvertuj("I");
        System.out.println(a);
        int b = konvertuj("V");
        System.out.println(b);


    } public static int konvertuj (String rimski) {
        int arapski = 0;
        if (rimski.equals("I")) {
            arapski= 1;
        }
        else if (rimski.equals("II")) {
            arapski= 2;
        }
        else if (rimski.equals("III")) {
            arapski= 3;
        }
        else if (rimski.equals("IV")) {
            arapski= 4;
        }
        else if (rimski.equals("V")) {
            arapski= 5;
        }
        return arapski;
    }
}
