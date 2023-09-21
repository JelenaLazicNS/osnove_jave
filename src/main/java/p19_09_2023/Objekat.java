package p19_09_2023;

public abstract class Objekat {
    protected String adresa;
    protected double povObjekta;
    protected int zona;

    public Objekat(String adresa, double povObjekta, int zona) {
        this.adresa = adresa;
        this.povObjekta = povObjekta;
        this.zona = zona;
    }

    public Objekat() {

    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovObjekta() {
        return povObjekta;
    }

    public void setPovObjekta(double povObjekta) {
        this.povObjekta = povObjekta;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double koeficijent() {
        if (zona == 1) {
            return 1.4;
        } else if (zona == 2) {
            return 1.1;
        }else {
            return 1.05;
        }
    }

    public abstract double racunajPorez();
    public abstract void stampaj();

}
