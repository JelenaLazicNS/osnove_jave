package d17_08_2023;

import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("POCETAK");

        //Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
       // Milan Jovanovic - 26 god


        System.out.print("Ime: ");
        String ime = s.next();
        System.out.print("Prezime: ");
        String prezime = s.next();
        System.out.print("Godina rodjenja: ");
        String godinaRodj = s.next();

        System.out.println(ime+" "+prezime+" - "+godinaRodj);

        System.out.println("KRAJ");
    }
}
