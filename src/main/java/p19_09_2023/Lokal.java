package p19_09_2023;

public class Lokal extends Objekat {
    public Lokal (){

    }

    public Lokal(String adresa, double povObjekta, int zona) {
        super(adresa, povObjekta, zona);
    }


    public double racunajPorez() {
       return this.povObjekta*koeficijent()*1.3;

    }

    @Override
    public void stampaj() {
        System.out.println(this.adresa+", "+this.povObjekta+", "+this.zona);

    }
}
