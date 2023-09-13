package d11_09_2023;

public class Knjiga {

    private String isbn;
    private String naziv;
    private int godIzdanja;
    private Autor autor;

    public Knjiga (String isbn, String naziv, int godIzdanja, String ime, String prezime) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godIzdanja = godIzdanja;
        this.autor = getAutor();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodIzdanja() {
        return godIzdanja;
    }

    public void setGodIzdanja(int godIzdanja) {
        this.godIzdanja = godIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void stampaj () {
        System.out.println("("+this.isbn+")");
        System.out.println("("+this.naziv+") - ("+this.godIzdanja+")");
        if (this.autor != null) {
            this.autor.stampaj();
        }

    }
}
