package p18_09_2023;
import p18_09_2023.PlatnaKarticaAb;

public class MasterKarticaAb extends PlatnaKarticaAb {

    public MasterKarticaAb(double suma, String brojKartice, int godina, int mesec, String imeOvlLica) {
        super(suma, brojKartice, godina, mesec);

    }

    @Override
    public double transakcija(double iznosTransakcije) {
        iznosTransakcije +=iznosTransakcije + (iznosTransakcije*1.5/100);
        this.suma -= iznosTransakcije;
        return iznosTransakcije;
    }

    @Override
    public void stampaj() {
        System.out.println("Master Card: ");
        System.out.print(this.brojKartice+", ");
        System.out.print(this.mesec+"/"+this.godina+", ");
        System.out.print("$"+this.suma);

    }
}
