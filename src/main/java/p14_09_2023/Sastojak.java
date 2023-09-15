package p14_09_2023;

public class Sastojak {
    private String ime;
    private double cena;

    public Sastojak(String ime, double cena) {
        this.ime = ime;
        this.cena = cena;
    }

    public String getIme() {
        return ime;
    }

    public double getCena() {
        return cena;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    public void stampaj () {
        System.out.println(this.ime+"-"+this.cena+"din.");
    }
}
