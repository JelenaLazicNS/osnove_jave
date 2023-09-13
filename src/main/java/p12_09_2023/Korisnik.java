package p12_09_2023;

public class Korisnik {
    private String imePrezime;
    private String licenca;

  //  public Korisnik (){
    //    this.licenca ="basic"
    //}

    public Korisnik (String imePrezime) {
        this.imePrezime = imePrezime;
        this.licenca = "basic";
    }

    public String getImePrezime() {
        return imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public String getLicenca() {
        return licenca;
    }

    public void pretplataPro (int iznosPlacanja) {
        if (iznosPlacanja == 100) {
            this.licenca = "pro";
        }else if (iznosPlacanja == 150) {
            this.licenca = "premium";
        }
    }
    public void ponistiPretplatu () {
        if (this.licenca.equals("basic")) {
            this.licenca = "basic";
        }
    }
    public int maksDuzina(){
        if(this.licenca.equals(("basic"))) {
            return 40;
        }else if (this.licenca.equals(("pro"))) {
            return 240;
        }else if (this.licenca.equals(("premium"))) {
            return 1440;
        }
        return 0;
    }



}

