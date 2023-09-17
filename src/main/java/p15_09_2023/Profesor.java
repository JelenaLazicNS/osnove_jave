package p15_09_2023;

public class Profesor extends Osoba {
    private String nazivPredmeta;
    private double iznosPlate;

    public Profesor (){
    }

    public Profesor(String imePrezime, String jmbg, String nazivPredmeta, double iznosPlate) {
        super(imePrezime, jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.iznosPlate = iznosPlate;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public double getIznosPlate() {
        return iznosPlate;
    }

    public void setIznosPlate(double iznosPlate) {
        this.iznosPlate = iznosPlate;
    }
    public void povecajPlatu(double procenat){

        this.iznosPlate = ((procenat + 100) * this.iznosPlate) / 100;
    }

   @Override
    public void stampaj(){
        System.out.println("Profesor: ");
        super.stampaj();
        System.out.println("Naziv predemeta: "+this.nazivPredmeta);
        System.out.println("Iznos plate: "+this.getIznosPlate());
    }
}
