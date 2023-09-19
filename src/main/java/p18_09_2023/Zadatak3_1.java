package p18_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3_1 {
    public static void main(String[] args) {
        FigureGenerator generator = new FigureGenerator();

        ArrayList<Figura>pravougaonici = new ArrayList<>();
            for (int i = 0; i<3; i++) {
                pravougaonici.add(generator.generisiFigure("pravougaonik"));
            }

        ArrayList<Figura>trouglovi = new ArrayList<>();
        for (int i = 0; i<2; i++) {
            trouglovi.add(generator.generisiFigure("trougao"));
        }
        for (int i = 0; i < pravougaonici.size(); i++) {
            pravougaonici.get(i).stampaj();
        }

        for (int i = 0; i < trouglovi.size(); i++) {
            trouglovi.get(i).stampaj();
        }

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        ArrayList<Figura> generateFigureTrougao = generator.generateNizTrougao(n);
        ArrayList<Figura> generateFigurePravougaonik = generator.generateNizPravougaonika(n);
        ArrayList<Figura> generateFigureMix = generator.generateNiz(n);

        System.out.println("Niz N trouglova:");

        for (int i = 0; i < generateFigureTrougao.size(); i++) {
            generateFigureTrougao.get(i).stampaj();
        }

        System.out.println("Niz N pravougaonika:");

        for (int i = 0; i < generateFigurePravougaonik.size(); i++) {
            generateFigurePravougaonik.get(i).stampaj();
        }

        System.out.println("Niz N trouglova i N pravougaonika:");

        for (int i = 0; i < generateFigureMix.size(); i++) {
            generateFigureMix.get(i).stampaj();
        }

    }



    }

