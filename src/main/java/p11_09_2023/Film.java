package p11_09_2023;

public class Film {
    //naziv filma
    //iz koje godine je film
    //konstruktore, gettere i settere
    //metodu print koja stampa podatke u formatu
    //naziv filma, godina

    private String naziv;
    private int godinaIzdanja;
    private Reziser reziser;

    public Film () {

    }

    public Film (String naziv, int godinaIzdanja, Reziser reziser) {
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.reziser = reziser;
    }

    public Film (String naziv, int godinaIzdanja) {
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getNaziv () {
        return this.naziv;
    }

    public void setNaziv (String naziv) {
        this.naziv = naziv;
    }
    public int getGodinaIzdanja () {
        return this.godinaIzdanja;
    }

    public void setGodinaIzdanja (int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Reziser getReziser () {
        return this.reziser;
    }

    public void setReziser (Reziser reziser) {
        this.reziser = reziser;
    }

    public void stampaj () {
        System.out.println("Film : "+this.naziv);
        System.out.println("Godina izdanja: "+this.godinaIzdanja);
        if (this.reziser != null) {
            this.reziser.stampaj();
        }
    }

}
