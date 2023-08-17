package p17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Unesite ime: ");
        String ime = s.next();
        System.out.print("Unesite prezime: ");
        String prezime = s.next();
        System.out.print("Unesite broj: ");
        String brojTelefona = s.next();
        System.out.print("Unesite email: ");
        String email = s.next();
        System.out.print("Unesite jmbg: ");
        int jmbg = s.nextInt();

        System.out.println(ime+", "+prezime+" - "+jmbg);
        System.out.println("Broj tel: "+brojTelefona);
        System.out.println("Email: "+email);




    }
}
