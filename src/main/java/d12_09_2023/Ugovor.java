package d12_09_2023;

public class Ugovor {

    private int godina;
    private int dan;
    private String mesec;
    private double cena;
    private String adresa;
    private FizickoLice kupac;
    private FizickoLice prodavac;

    public Ugovor(int godina, int dan, String mesec, double cena, String adresa, FizickoLice kupac, FizickoLice prodavac) {
        this.godina = godina;
        this.dan = dan;
        this.mesec = mesec;
        this.cena = cena;
        this.adresa = adresa;
        this.kupac = kupac;
        this.prodavac = prodavac;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }

    public String getMesec() {
        return mesec;
    }

    public void setMesec(String mesec) {
        this.mesec = mesec;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public void setKupac(FizickoLice kupac) {
        this.kupac = kupac;
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }

    public void setProdavac(FizickoLice prodavac) {
        this.prodavac = prodavac;
    }
    public double procenatZarade () {
        if(kupac.getPrethodnoKupovao()){
            return 0.02;
        }else {
            return 0.03;
        }
    }
    public double zaradaAgencije () {
        return 1000 + this.cena * this.procenatZarade();
    }
    //Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca)
    // o kupovini nekretnine (adresa) po ceni od (cena nekretnin) pri cemu je kupac u obavezi
    // da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)
    public void stampaj() {
        System.out.println("Dana ("+this.dan+"."+this.mesec+" "+this.godina+".)god sklopljen je " +
                "ugovor izmedju ("+ this.prodavac+") i ("+this.kupac+") o kupovini nekretnine ("+this.adresa+
                ") po ceni od ("+this.cena+") pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost " +
                "u iznosu od ("+this.zaradaAgencije()+")");
    }
}
