package p19_09_2023;

public class Kuca extends Objekat {

    public int brClanova;

   public Kuca () {
       super();
   }

    public Kuca(String adresa, double povObjekta, int zona, int brClanova) {
        super(adresa, povObjekta, zona);
        this.brClanova = brClanova;
    }

    public int getBrClanova() {
        return brClanova;
    }

    public void setBrClanova(int brClanova) {
        this.brClanova = brClanova;
    }

    @Override
    public double racunajPorez() {
       return this.povObjekta * koeficijent();
    }

    @Override
    public  void stampaj(){
        System.out.println(this.adresa+", "+this.povObjekta+", "+this.zona);
        System.out.println(this.brClanova);


    }
}

