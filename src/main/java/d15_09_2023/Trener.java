package d15_09_2023;

public class Trener extends Osoba{
    private String tipTrenera;
    private int godIskustva;

    public Trener (){

    }

    public Trener(String imePrezime, String jmbg, int godRodjenja, int godIskustva, String tipTrenera) {
        super(imePrezime, jmbg, godRodjenja);
        this.tipTrenera = tipTrenera;
        this.godIskustva = godIskustva;
    }

    @Override
    public void stampaj () {
        super.stampaj();
    }
}
