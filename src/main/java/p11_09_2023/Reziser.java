package p11_09_2023;

public class Reziser {
    //Kreirati klasu Reziser koja ima:
    //ime i prezime rezisera
    //starost
    //konstruktore, gettere i settere koji su potrebni
    //metodu print koja stampa podatke u formatu
    //ime prezime, starost.god

    private String imePrezime;
    private int starost;

    public Reziser(String imePrezime, int starost) {
        this.imePrezime = imePrezime;
        this.starost = starost;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void stampaj() {
        System.out.println(this.imePrezime);
        System.out.println(this.starost);
    }
}
