package p18_09_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

        JednakostranicniTrougao trougao1 = new JednakostranicniTrougao(5);
        JednakostranicniTrougao trougao2 = new JednakostranicniTrougao(4);
        Pravougaonik pravougaonik1 = new Pravougaonik(3, 4);
        Pravougaonik pravougaonik2 = new Pravougaonik(5, 6);
        Pravougaonik pravougaonik3 = new Pravougaonik(7, 8);

        ArrayList<Figura>figure = new ArrayList<>();

        figure.add(trougao1);
        figure.add(trougao2);
        figure.add(pravougaonik1);
        figure.add(pravougaonik2);
        figure.add(pravougaonik3);

        Figura f;
        f=trougao1;
        f.stampaj();
        f=trougao2;
        f.stampaj();
        f=pravougaonik1;
        f.stampaj();
        f=pravougaonik2;
        f.stampaj();
        f=pravougaonik3;
        f.stampaj();

        figure = new ArrayList<>();
        Figura f2 = new JednakostranicniTrougao(10);
        figure.add(new JednakostranicniTrougao(20));
        figure.add(new Pravougaonik(10, 20));
        figure.add(new Pravougaonik(10, 15));
        figure.add(new Pravougaonik(15, 20));

        double povrsine = 0;
        double obimi =0;

        for (int i = 0; i< figure.size(); i++) {
            povrsine= povrsine+ figure.get(i).povrsina();
            obimi= obimi+ figure.get(i).obim();
        }


    }
}
