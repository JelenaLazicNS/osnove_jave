package d15_09_2023;

public class Osoba {
    protected String imePrezime;
    protected String jmbg;
    protected int godRodjenja;

    public Osoba() {
    }

    public Osoba(String imePrezime, String jmbg, int godRodjenja) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }

    public void stampaj(){
        System.out.println("("+this.imePrezime+"), ("+this.jmbg+"), ("+this.godRodjenja+")");
    }
}
