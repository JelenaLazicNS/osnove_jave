package d12_09_2023;

public class Transakcija {
    private String id;
    private String racunSa;
    private String racunNa;

    private Racun getStanjeRacuna;

    public Transakcija(String id, String racunSa, String racunNa) {
        this.id = id;
        this.racunSa = racunSa;
        this.racunNa = racunNa;
    }

    public String getId() {
        return id;
    }

   /* public void setId(String id) {
        this.id = id;
    }*/

    public String getRacunSa() {
        return racunSa;
    }

  /*  public void setRacunSa(String racunSa) {
        this.racunSa = racunSa;
    }*/

    public String getRacunNa() {
        return racunNa;
    }

   /* public void setRacunNa(String racunNa) {
        this.racunNa = racunNa;
    }*/

    public double racunajProviziju (double iznos) {
        if (iznos<4500) {
            return 45;
        } else {
            return iznos * 0.01;
        }
    }
    public void izvrsiTransakciju (double iznos) {
        if (racunSa.getStanjeRacuna() >= iznos + racunajProviziju(iznos)) {
          this.racunSa.skiniSaRacuna((iznos + racunajProviziju(iznos)));
          this.racunNa.uplatiNaRacun(iznos);
            System.out.println("Transakcija izvrsena");
        } else {
            System.out.println("Nemate dovoljno sredstva na racunu");
        }
    }

}

