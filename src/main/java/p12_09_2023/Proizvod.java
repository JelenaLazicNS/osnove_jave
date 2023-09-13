package p12_09_2023;

public class Proizvod {

    private String naziv;
    private int cenaIzrade;
    private int cenaProizvoda;

    private Kupac kupac;
    private Kartica kartica;


    public Proizvod (String naziv, int cenaIzrade){
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(int cenaIzrade) {
       this.cenaIzrade = cenaIzrade;
    }
    public double cenaProizvoda () {
        return this.cenaIzrade * 1.9 * (100-this.kupac.getKartica().getPopust())/100;
    }

    public void stampaj () {
        System.out.println(this.naziv+" - "+this.cenaProizvoda);
      //  System.out.println(this.getImePrezime()+" - "+this.getbrojKartice());
    }

    //Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
    //cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
    //Metodu za stampanje proizvoda u formatu:
    //naziv proizvoda - cena
    //ime i prezime - broj kartice
}
