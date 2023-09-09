package d07_09_2023;

import java.util.Scanner;

public class Domaci5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Oprema firstItem = new Oprema();
        Oprema secondItem = new Oprema();
        Oprema thirdItem = new Oprema();

        System.out.println("Unesite tip opreme za prvi artikal:");
        firstItem.tip = s.next();
        System.out.println("Unesite marku za prvi artikal: ");
        firstItem.marka = s.next();
        System.out.println("Unesite cenu za prvi artikal: ");
        firstItem.cena = s.nextDouble();

        System.out.println("Unesite tip opreme za drugi artikal:");
        secondItem.tip = s.next();
        System.out.println("Unesite marku za drugi artikal: ");
        secondItem.marka = s.next();
        System.out.println("Unesite cenu za drugi artikal: ");
        secondItem.cena = s.nextDouble();

        System.out.println("Unesite tip opreme za treci artikal:");
        thirdItem.tip = s.next();
        System.out.println("Unesite marku za treci artikal: ");
        thirdItem.marka = s.next();
        System.out.println("Unesite cenu za treci artikal: ");
        thirdItem.cena = s.nextDouble();

        System.out.println("Oprema "+firstItem.tip+", marka "+firstItem.marka+", cena "+firstItem.cena+" din");
        System.out.println("Oprema "+secondItem.tip+", marka "+secondItem.marka+", cena "+secondItem.cena+" din");
        System.out.println("Oprema "+thirdItem.tip+", marka "+thirdItem.marka+", cena "+thirdItem.cena+" din");

    }
}
