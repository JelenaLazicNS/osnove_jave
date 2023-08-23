package p22_08_2023;

import java.util.Scanner;

public class Zadatak1_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //

       int broj = 0;
       int end = 0; // end = 1
        boolean isValid=false;

        while (isValid == false) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            if (broj<10 || broj>50) {
                System.out.println("Uneti broj nije u opsegu 10 do 50");
            }
            if (broj>=10 && broj<=50){
                isValid = true;
            }
        }
        System.out.println("Kraj");
    }
}
