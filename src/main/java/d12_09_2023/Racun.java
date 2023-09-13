package d12_09_2023;

public class Racun {
    private String brRacuna;
    private String imePrezime;
    private double stanjeRacuna;


    public Racun (String brRacuna, String imePrezime, double stanjeRacuna) {
        this.brRacuna = brRacuna;
        this.imePrezime = imePrezime;
        this.stanjeRacuna = stanjeRacuna;
    }

    public String getBrRacuna() {
        return brRacuna;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getStanjeRacuna() {
        return stanjeRacuna;
    }
    public void uplatiNaRacun (double iznos) {
        this.stanjeRacuna = stanjeRacuna + iznos;

    }
    public void skiniSaRacuna (double iznos) {
        this.stanjeRacuna = stanjeRacuna - iznos;
    }
    public void stampaj() {
        System.out.println(this.imePrezime+" - "+this.brRacuna);
        System.out.println("Stanje na racunu je: "+this.stanjeRacuna+"rsd.");

    }
}
