package p19_09_2023;

public class Zgrada extends Objekat{
    private int brStanova;

    public Zgrada(){

    }

    public Zgrada(String adresa, double povObjekta, int zona, int brStanova) {
        super(adresa, povObjekta, zona);
        this.brStanova = brStanova;
    }

    public int getBrStanova() {
        return brStanova;
    }

    public void setBrStanova(int brStanova) {
        this.brStanova = brStanova;
    }

    @Override
    public double racunajPorez() {
        return this.povObjekta * this.koeficijent()*brStanova;
    }

    @Override
    public void stampaj() {
        System.out.println(this.adresa+", "+this.povObjekta+", "+this.zona);
        System.out.println(this.brStanova);

    }
}
