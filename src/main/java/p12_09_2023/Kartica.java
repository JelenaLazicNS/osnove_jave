package p12_09_2023;

public class Kartica {

    private String brKartice;
    private int popust;



    public Kartica (int popust, String brKartice) {
        this.popust = popust;
        this.brKartice = brKartice;
    }


    public void setBrKartice(String brKartice) {
        this.brKartice = brKartice;
    }
    public void setPopust(int popust) {
        this.popust = popust;
    }

    public String getBrKartice() {
        return brKartice;
    }

    public int getPopust() {
        return popust;
    }
}
