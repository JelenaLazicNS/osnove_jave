package p22_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String rec = "";
        String psovka1 = "zajebava";
        String psovka2 = "mars";
        String psovka3 = "stoko";
        String psovka4 = "svinjo";
        boolean endOfLine = false;

        while (!endOfLine) {
            System.out.println("Unesite rec: ");
            rec = s.next();

            if ((rec.contains(psovka1)) || (rec.contains(psovka2)) ||
                    (rec.contains(psovka3)) || (rec.contains(psovka4))) {
                System.out.println("beeeeeep");
            } else {
                System.out.println(rec);
            }
            if (rec.endsWith(".")) {
                endOfLine = true;
            }

        }

    }
}
