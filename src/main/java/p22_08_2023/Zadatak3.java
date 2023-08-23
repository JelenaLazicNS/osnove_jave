package p22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:2
        //Unesite broj:3
        //Unesite broj:0
        //Unesite broj:5
        //Unesite broj:3
        //Unesite broj:4
        //Kraj programa

        int broj = 0;
        int oneCounter = 0;
        int twoCounter = 0;
        int threeCounter = 0;
        int fourCounter = 0;
        boolean isAll = false;

        while (!isAll) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();

            if (broj==1) {
                oneCounter++;
            }
            else if (broj==2) {
                twoCounter++;
            }
            else if (broj==3) {
                threeCounter++;
            }
            else if (broj==4) {
                fourCounter++;
            }

            if (oneCounter>0 && twoCounter>0 && threeCounter>0 && fourCounter>0){
                isAll = true;
            }
        } System.out.println("Kraj jer su unete dve nule");



    }

}
