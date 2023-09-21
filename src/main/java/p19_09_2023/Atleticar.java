package p19_09_2023;

public abstract class Atleticar {
    private String imePrezime;
    protected double rezultat;

    public Atleticar(String imePrezime, double rezultat) {
        this.imePrezime = imePrezime;
        this.rezultat = rezultat;
    }

    public Atleticar() {

    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }
// a1 i a2
    //a1 bolji od a2>a1.jeBolji(Atleticar a)
    public abstract boolean daLiJeBolji ();

    public void stampaj() {
        System.out.println("("+this.imePrezime+") ("+this.rezultat+")");
    }

    public abstract boolean daLiJeBolji(Atleticar a);
}
