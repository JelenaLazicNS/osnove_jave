package p18_09_2023;

public abstract class PlatnaKarticaAb {
    protected double suma;
    protected String brojKartice;
    protected int godina;
    protected int mesec;

    public PlatnaKarticaAb(double suma, String brojKartice, int godina, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    public void uplata(double novaUplata) {
        this.suma += novaUplata;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }
    public abstract double transakcija (double iznosTransakcije);

    public abstract void stampaj ();
}
