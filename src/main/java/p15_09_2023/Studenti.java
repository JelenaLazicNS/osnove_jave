package p15_09_2023;

public class Studenti extends Osoba{
    private String brIndexa;
    private double dugSkolarina;


    public Studenti () {

    }

    public Studenti(String imePrezime, String jmbg, String brIndexa, double dugSkolarina) {
        super(imePrezime, jmbg);
        this.brIndexa = brIndexa;
        this.dugSkolarina = dugSkolarina;
    }

    public String getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(String brIndexa) {
        this.brIndexa = brIndexa;
    }

    public double getDugSkolarina() {
        return dugSkolarina;
    }

    public void setDugSkolarina(double dugSkolarina) {
        this.dugSkolarina = dugSkolarina;
    }

    public void uplatiSkolarinu (double uplata) {
        if (this.dugSkolarina > 0 || this.dugSkolarina >= uplata) {
            this.dugSkolarina -= uplata;
        }
    }

    @Override
    public void stampaj(){
        System.out.println("Student: ");
        super.stampaj();
        System.out.println("Broj indexa: "+this.brIndexa);
        System.out.println("Dug za skolarinu:"+this.getDugSkolarina());
        System.out.println();
    }
}
