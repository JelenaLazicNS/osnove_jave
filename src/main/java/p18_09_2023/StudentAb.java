package p18_09_2023;

public abstract class StudentAb {

    protected String imePrezime;
    protected int brIndexa;
    protected int godinaStudija;

    public StudentAb() {
    }

    public StudentAb(String imePrezime, int brIndexa, int godinaStudija) {
        this.imePrezime = imePrezime;
        this.brIndexa = brIndexa;
        this.godinaStudija = godinaStudija;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public abstract int cenaSkolarine ();

    public abstract boolean naBudzetu();

    public void stampaj(){
        System.out.println(this.imePrezime + ", " + this.brIndexa + ", " + this.godinaStudija + ". godina");
        System.out.print("Finansiranje: ");
        if (naBudzetu()) {
            System.out.println("budzet");
        } else {
            System.out.println("samofinansirajuci");
        }
    }
}
