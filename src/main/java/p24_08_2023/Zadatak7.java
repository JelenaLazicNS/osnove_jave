package p24_08_2023;

import java.util.ArrayList;


public class Zadatak7 {
    public static void main(String[] args) {
        ArrayList<Integer> cena = new ArrayList<>();
        ArrayList<String> pasta = new ArrayList<>();

        pasta.add("Aglio_e_olio");
        pasta.add("Promavera");
        pasta.add("Arabiata");
        pasta.add("Napolitana");
        pasta.add("Pollo_e_spinaci");

        cena.add(500);
        cena.add(340);
        cena.add(420);
        cena.add(440);
        cena.add(550);

        for (int i=0; i< pasta.size(); i++) {
            System.out.println(pasta.get(i) + "............" + cena.get(i));

        }


   //     System.out.println(pasta);
     //   System.out.println(cena);




    }
}
