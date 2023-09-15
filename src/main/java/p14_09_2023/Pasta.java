package p14_09_2023;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> sastojak;

    public Pasta () {
        this.sastojak = new ArrayList<>();
    }

    public ArrayList<Sastojak> getSastojak() {
        return sastojak;
    }
    public void dodajSastojak(Sastojak newSastojak){
        this.sastojak.add(newSastojak);
    }

    public double cena () {
        double ukupnaCena = 0;
        for (int i=0; i<this.sastojak.size(); i++) {
            ukupnaCena = ukupnaCena + this.sastojak.get(i).getCena();
        } return ukupnaCena;

    }
    public void stampaj() {
        System.out.println("Pasta je sa sastojcima: ");
        for (int i=0; i<this.sastojak.size(); i++) {
            System.out.println(this.sastojak.get(i).getIme()+"-"+this.sastojak.get(i).getCena());
        }
        System.out.println("Cena svih sastojaka paste je: "+this.cena()+"din");
    }

    public void obrisi () {

    }


}
