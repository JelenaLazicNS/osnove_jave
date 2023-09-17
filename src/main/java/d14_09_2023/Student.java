package d14_09_2023;

import java.util.ArrayList;

public class Student {
    private int brIndexa;
    private String imePrezime;
    private String tipStudija;

    private ArrayList<Ispit>nazivPredmeta;

    public Student(int brIndexa, String imePrezime, String tipStudija) {
        this.brIndexa = brIndexa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
        this.nazivPredmeta = new ArrayList<>();
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getNazivPredmeta() {
        return nazivPredmeta;
    }

}
