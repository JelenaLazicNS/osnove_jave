package p19_09_2023;

public class Trkac extends Atleticar {

    public Trkac() {

    }

    @Override
    public boolean daLiJeBolji() {
        return false;
    }

    public Trkac(String imePrezime, double rezultat) {
        super(imePrezime, rezultat);
    }

    @Override
    public boolean daLiJeBolji(Atleticar a) {
        //   if (this.rezultat<a.rezultat){
        //      return true;
        //   }else {
        //     return false;
        //   }

        return this.rezultat < a.rezultat;


    }
}
