package p14_09_2023;

public class Reakcija {
    private String tipReakcije;
    private String imePrezimeKoJeReagovao;

    public Reakcija(String tipReakcije, String imePrezimeKoJeReagovao) {
        this.tipReakcije = tipReakcije;
        this.imePrezimeKoJeReagovao = imePrezimeKoJeReagovao;
    }

    public String getTipReakcije() {
        return tipReakcije;
    }

    public String getImePrezimeKoJeReagovao() {
        return imePrezimeKoJeReagovao;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public void setImePrezimeKoJeReagovao(String imePrezimeKoJeReagovao) {
        this.imePrezimeKoJeReagovao = imePrezimeKoJeReagovao;
    }

}
