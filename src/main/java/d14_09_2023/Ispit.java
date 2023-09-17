package d14_09_2023;

public class Ispit {
    public String nazivPredmeta;
    public int ocena;
    public String imePrezimeProfesora;

    public Ispit(String nazivPredmeta, int ocena, String imePrezimeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imePrezimeProfesora = imePrezimeProfesora;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }

    public void setImePrezimeProfesora(String imePrezimeProfesora) {
        this.imePrezimeProfesora = imePrezimeProfesora;
    }
}
