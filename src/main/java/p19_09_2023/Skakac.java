package p19_09_2023;

public class Skakac extends Atleticar {
    public Skakac(String imePrezime, double rezultat) {
        super(imePrezime, rezultat);
    }

    @Override
    public boolean daLiJeBolji() {
        return false;
    }

    @Override
    public boolean daLiJeBolji(Atleticar a) {
        if (this.rezultat > a.rezultat) {
            return true;
        } else {
            return false;
        }

    }
}
