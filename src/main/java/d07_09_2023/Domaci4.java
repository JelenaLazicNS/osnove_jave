package d07_09_2023;

import java.util.Scanner;

public class Domaci4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Film firstMovie = new Film();
        System.out.print("Unesite naslov 1.filma: ");
        firstMovie.naslov = s.next();
        System.out.print("Unesite godinu izdanja 1.filma: ");
        firstMovie.godina = s.nextInt();
        System.out.print("Unesite rezisera 1.filma: ");
        firstMovie.reziser = s.next();
        System.out.println();

        Film secondMovie = new Film();
        System.out.print("Unesite naslov 2.filma: ");
        secondMovie.naslov = s.next();
        System.out.print("Unesite godinu izdanja 2.filma: ");
        secondMovie.godina = s.nextInt();
        System.out.print("Unesite rezisera 2.filma: ");
        secondMovie.reziser = s.next();
        System.out.println();

        Film thirdMovie = new Film();
        System.out.print("Unesite naslov 3.filma: ");
        thirdMovie.naslov = s.next();
        System.out.print("Unesite godinu izdanja 3.filma: ");
        thirdMovie.godina = s.nextInt();
        System.out.print("Unesite rezisera 3.filma: ");
        thirdMovie.reziser = s.next();

        System.out.println("Film "+firstMovie.naslov+", godina "+firstMovie.godina+", reziser "+firstMovie.reziser);
        System.out.println("Film "+secondMovie.naslov+", godina "+secondMovie.godina+", reziser "+secondMovie.reziser);
        System.out.println("Film "+thirdMovie.naslov+", godina "+thirdMovie.godina+", reziser "+thirdMovie.reziser);



    }
}
