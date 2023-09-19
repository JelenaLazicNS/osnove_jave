package p18_09_2023;

import p18_09_2023.PlatnaKarticaAb;

public class VisaKarticaAb extends PlatnaKarticaAb {
    private String imeOvlLica;

    public VisaKarticaAb(double suma, String brojKartice, int godina, int mesec, String imeOvlLica) {
        super(suma, brojKartice, godina, mesec);
        this.imeOvlLica = imeOvlLica;
    }

    public String getImeOvlLica() {
        return imeOvlLica;
    }

    public void setImeOvlLica(String imeOvlLica) {
        this.imeOvlLica = imeOvlLica;
    }

    @Override
    public double transakcija(double iznosTransakcije) {
        if (iznosTransakcije * 1.8 / 100 < 4) {
            iznosTransakcije = iznosTransakcije + 4;
        } else {
            iznosTransakcije = iznosTransakcije + (iznosTransakcije * 1.8 / 100);
        }
        this.suma -= iznosTransakcije;
        return iznosTransakcije;
    }

    @Override
    public void stampaj() {
        System.out.println(this.imeOvlLica);
        System.out.print(this.brojKartice+", ");
        System.out.print(this.mesec+"/"+this.godina+", ");
        System.out.print("$"+this.suma);
    }
}
