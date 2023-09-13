package d11_09_2023;

public class FacebookPost {

    private String opis;

    private Korisnik korisnik;

    public FacebookPost (String opis, String ime, String prezime) {
        this.opis = opis;
        this.korisnik = getKorisnik();
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
    public void stampaj() {
        if (this.korisnik!=null) {
            this.korisnik.stampaj();
        } System.out.println("("+this.opis+")");
    }


}
