package d21_08_2023;

import java.util.Scanner;

public class Domaci4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Primer izvrsenja:
        //Unesite N: 7
        //	Reaguj: like
        //	Reaguj: heart
        //	Reaguj: smile
        //	Reaguj: lol
        //	Reaguj: smile
        //	Reaguj: like
        //	Reaguj: like
        //Summary: like 3 | smile 2 | heart 1

        System.out.print("Unesite N ");
        int N = s.nextInt();
        int likeCounter = 0;
        int smileCounter = 0;
        int heartCounter = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Unesite reakciju: ");
            String rec = s.next();

            if (rec.equals("like")) {
                likeCounter = likeCounter + 1;
            } else if (rec.equals("smile")) {
                smileCounter = smileCounter + 1;
            } else if (rec.equals("heart")) {
                heartCounter = heartCounter + 1;
            }
        }
        System.out.println("Summary: like " + likeCounter + " smile " + smileCounter + " heart " + heartCounter);
    }
}
