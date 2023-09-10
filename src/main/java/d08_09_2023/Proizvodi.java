package d08_09_2023;

public class Proizvodi {

    public String naziv;
    public double cena;
    public double tezinaGr;

    public void stampaj () {
        System.out.println(this.naziv+ ", cena: "+this.cena+", tezina: "+this.tezinaGr+" gr");
    }
    public void povecajCenu(double povecanje){
        this.cena += povecanje;
    }

    public double vratiCenuSaPopustom(int popust){
        double iznosPopusta = this.cena * popust/100;
        return this.cena -= iznosPopusta;
    }

    public int racunajPostarinu(){
        if(this.tezinaGr <= 100)
            return 200;
        else if (this.tezinaGr >100 && this.tezinaGr <=500)
            return 400;
        else return 1000;
    }
}

