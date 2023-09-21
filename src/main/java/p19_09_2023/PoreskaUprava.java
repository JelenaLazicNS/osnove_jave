package p19_09_2023;


import java.util.ArrayList;
import java.util.List;

public class PoreskaUprava {
    private String imeGrada;
    private ArrayList<Objekat>objekti;

    public PoreskaUprava (){
        objekti = new ArrayList<>();
    }
    public PoreskaUprava(String imeGrada){
        this.imeGrada = imeGrada;
        objekti = new ArrayList<>();
    }

    public String getImeGrada() {
        return imeGrada;
    }

    public void setImeGrada(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public void dodajObjekat (Objekat o){
        this.objekti.add(o);
    }

    public double ukupanPorez (){
        double suma = 0;
        for (int i=0; i<this.objekti.size(); i++){
            suma += this.objekti.get(i).racunajPorez();
        } return suma;
    }

    public void stampajSve() {
        for (int i=0; i<this.objekti.size(); i++){
            this.objekti.get(i).stampaj();
        }
        System.out.println("Ukupan porez: "+ this.ukupanPorez());

    }
    public Objekat najveciPorez (){
        Objekat najveci = this.objekti.get(0);
        for (int i=0; i<this.objekti.size(); i++) {
            Objekat objekat = this.objekti.get(i);
            if (objekat.racunajPorez()> najveci.racunajPorez()){
                najveci = this.objekti.get(i);
            }
        } return najveci;
    }
public Objekat najmanjiPorez (){
        Objekat najmanji = this.objekti.get(0);
        for (int i = 0; i<this.objekti.size(); i++){
            Objekat objekat = this.objekti.get(i);
            if (objekat.racunajPorez()< najmanji.racunajPorez()){
                najmanji = this.objekti.get(i);
            }
        } return najmanji;
}


}
