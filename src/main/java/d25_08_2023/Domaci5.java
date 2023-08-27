package d25_08_2023;

import java.util.Scanner;

public class Domaci5 {
    public static void main(String[] args) {
        //Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
        //Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
        //Primer izvrsenja main programa:
        //Unesite vrednost u eurima: 3
        //Unesite valutu za konverziju: RSD
        //3 EUR je 351.6339 RSD
        //Konverzija eura u druge valute:
        //1 EUR = 117.5 RSD
        //1 EUR = 1.1 USD
        //1 EUR = 62.98 RUB

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost u eurima: ");
        double eur = s.nextDouble();

        System.out.println("Unesite valutu za konverziju: ");
        String valuta = s.next();

        System.out.println(eur + " EUR = " + converter(eur, valuta) + " " + valuta);
    }

    public static double converter(double iznos, String valuta) {
        double izracunatiIznos = 0;
        if (valuta.equals("RSD")) {
            izracunatiIznos = iznos * 117.5;
        } else if (valuta.equals("USD")) {
            izracunatiIznos = iznos * 1.1;
        } else if (valuta.equals("RUB")) {
            izracunatiIznos = iznos + 62.98;
        } else {
            return 0;
        }
        return izracunatiIznos;
    }
}
