package p15_09_2023;

public class VisaKartica extends PlatnaKartica {

    private String imeOvlLica;

    public VisaKartica(double suma, String brojKartice, int godina, int mesec, String imeOvlLica) {
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
    public void transakcija (double iznosTransakcije) {
       int i = 4;
     //  if ((1.8 * iznosTransakcije) / 100)<i) {
           iznosTransakcije = iznosTransakcije + 4;
       }
     //  else if {
      //     iznosTransakcije = iznosTransakcije + (iznosTransakcije * 1.8 / 100);
      //     super.transakcija(iznosTransakcije);
       //}

    public void stampaj (){
        System.out.println("Visa Card ");
        super.stampaj();
        System.out.println("Ime ovlascenog lica: "+this.imeOvlLica);
        System.out.println();
    }
}

