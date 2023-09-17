package p15_09_2023;

public class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected int godina;
    protected int mesec;
    protected double iznosTransakcije;

    public PlatnaKartica(double suma, String brojKartice, int godina, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    public double getSuma() {
        return suma;
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
    public void dodajSredstva (double iznos) {
        this.suma += iznos;
    }
    public void transakcija (double iznosTransakcije) {
        this.suma -= iznosTransakcije;
    }
    public void stampaj (){
        System.out.print(this.brojKartice+", ");
        System.out.print(this.mesec+"/"+this.godina+", ");
        System.out.print("$"+this.getSuma());

    }

}
