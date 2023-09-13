package p12_09_2023;

public class Kupac {

    private String imePrezime;
    private Kartica kartica;

    public Kupac (String imePrezime, Kartica kartica) {
        this.imePrezime = imePrezime;
        this.kartica = kartica;
    }

    public String getImePrezime() {
        return imePrezime;
    }
    public Kartica getKartica() {
        return kartica;
    }

    public void stampaj(){
        System.out.println(this.imePrezime+" - "+this.kartica);
    }
}
