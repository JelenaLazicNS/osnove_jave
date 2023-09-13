package d12_09_2023;

public class FizickoLice {

    private String imePrezime;
    private String jmbg;
    private String brLk;
    private boolean prethodnoKupovao;

    public FizickoLice (String imePrezime, String jmbg, String brLk) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
        this.brLk = brLk;
        if (prethodnoKupovao) this.prethodnoKupovao = true;
        else this.prethodnoKupovao = false;
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

    public String getBrLk() {
        return brLk;
    }

    public void setBrLk(String brLk) {
        this.brLk = brLk;
    }

    public boolean getPrethodnoKupovao() {
        return prethodnoKupovao;
    }
    public void setPrethodnoKupovao(boolean prethodnoKupovao) {
        this.prethodnoKupovao = prethodnoKupovao;
    }
    public void stampaj() {
        System.out.println(this.imePrezime+", "+this.brLk);
    }
}
