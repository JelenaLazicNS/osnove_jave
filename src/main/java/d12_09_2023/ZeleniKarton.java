package d12_09_2023;

public class ZeleniKarton {
    private String imePrezimeStudenta;
    private String brIndexa;
    private String predmet;
    private String imePrezimeProfesora;
    private int ocena;

    public ZeleniKarton (String imePrezimeStudenta,String brIndexa, String predmet, String imePrezimeProfesora, int ocena) {
        this.imePrezimeStudenta = imePrezimeStudenta;
        this.brIndexa = brIndexa;
        this.predmet = predmet;
        this.imePrezimeProfesora = imePrezimeProfesora;
        this.ocena = ocena;
    }

    public String getImePrezimeStudenta() {
        return imePrezimeStudenta;
    }

    public void setImePrezimeStudenta(String imePrezimeStudenta) {
        this.imePrezimeStudenta = imePrezimeStudenta;
    }

    public String getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(String brIndexa) {
        this.brIndexa = brIndexa;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }

    public void setImePrezimeProfesora(String imePrezimeProfesora) {
        this.imePrezimeProfesora = imePrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public void polozenIspit () {
        if (ocena>5) {
            System.out.println("Ispit je polozen!");
        } else {
            System.out.println("Ispit nije polozen");
        }

    }

    public void stampaj() {
        System.out.println("("+this.predmet+") - ("+this.ocena+")");
        System.out.println("Student: "+this.imePrezimeStudenta+", broj indexa: "+this.brIndexa);
        System.out.println("Profesor: "+this.imePrezimeProfesora);
    }
}
