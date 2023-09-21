package d18_09_2023;

public class VideoPlayer {
    private int duzinaVidea;
    private int trenutnoVreme;
    private int jacinaZvuka;
    private int kvalitetVidea;

    public VideoPlayer() {
    }

    public VideoPlayer(int duzinaVidea, int trenutnoVreme, int jacinaZvuka, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public void stampaj(){
        System.out.println(this.trenutnoVreme);
        System.out.println(this.jacinaZvuka);
        System.out.println(this.kvalitetVidea);
    }
}
