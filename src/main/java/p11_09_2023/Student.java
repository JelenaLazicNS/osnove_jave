package p11_09_2023;

public class Student {

    private String ime;
    private String prezime;
    private int brIndexa;
    private boolean naBudzetu;


    public String getIme () {
        return this.ime;
    }

    public void setIme (String ime) {
        this.ime = ime;
    }
    public String getPrezime () {
        return this.prezime;
    }
    public void setPrezime (String prezime) {
        this.prezime = prezime;
    }
    public int getBrIndexa () {
        return this.brIndexa;
    }
    public void setBrIndexa (int brIndexa) {
        this.brIndexa = brIndexa;
    }
    public boolean getNaBudzetu () {
        return this.naBudzetu;
    }
    public void setNaBudzetu (boolean naBudzetu) {
        this.naBudzetu= naBudzetu ;
    }
    public void stampaj() {
        System.out.println(this.ime);
        System.out.println(this.prezime);
        System.out.println(this.brIndexa);
        System.out.println(this.naBudzetu);
    }
}
