package d11_09_2023;

public class Korisnik {

    private String ime;
    private String prezime;

    public Korisnik (String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
    public String getIme () {
        return this.ime;
    }
    public void setIme() {
        this.ime = ime;
    }
    public String getPrezime () {
        return this.prezime;
    }
    public void setPrezime () {
        this.prezime = prezime;
    }

    public void stampaj () {
        System.out.print("("+this.ime+") ");
        System.out.println("("+this.prezime+")");
    }
}
