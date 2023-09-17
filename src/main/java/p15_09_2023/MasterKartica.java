package p15_09_2023;

public class MasterKartica extends PlatnaKartica{

    public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);

    }
    @Override
    public void transakcija (double iznosTransakcije) {
   //    iznosTransakcije = iznosTransakcije() + (iznosTransakcije*1.5/100);
       super.transakcija(iznosTransakcije);
    }
    public void dodajOdrzavanje () {
        double odrzavanje = this.getSuma() - 2;
    }


    @Override
    public void stampaj (){
        System.out.println("Master Card ");
        super.stampaj();
    }
}
