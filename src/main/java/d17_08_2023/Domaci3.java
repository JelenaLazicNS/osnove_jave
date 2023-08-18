package d17_08_2023;

import java.util.Scanner;

public class Domaci3 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("POCETAK");

        //Enter actual url: google.com/ivalid_login
        //Enter expected url: google.com/home
        //Enter error code: URL_MISSMATCH
        //Assertion Error: Expected google.com/home but got google.com/ivalid_login, error code:  URL_MISSMATCH
        //
        //Primer izvrsenja2:
        //Enter actual url: google.com/home
        //Enter expected url: google.com/home
        //Enter error code: URL_MISSMATCH
        //1 Test passed.

        System.out.print("Enter actual url: ");
        String urlA = s.next();
        System.out.print("Enter expected url: ");
        String urlE = s.next();
        System.out.print("Enter error code: ");
        String errorCode = s.next();



        if (urlA.equals(urlE)) {
            System.out.println("Test passed.");
        }
        else {
                System.out.println("Assertion Error:  Expected "+urlE+" but got "+urlA+", error code: "+errorCode);
        }
        System.out.println("KRAJ");
    }

}
