package p14_09_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String imePrezimeKoJeStavioOglas;
    private String text;
    private ArrayList<Reakcija>reakcije;

    public FacebookPost(String imePrezimeKoJeStavioOglas, String text) {
        this.imePrezimeKoJeStavioOglas = imePrezimeKoJeStavioOglas;
        this.text = text;
        this.reakcije = new ArrayList<>();
    }

    public String getImePrezimeKoJeStavioOglas() {
        return imePrezimeKoJeStavioOglas;
    }

    public void setImePrezimeKoJeStavioOglas(String imePrezimeKoJeStavioOglas) {
        this.imePrezimeKoJeStavioOglas = imePrezimeKoJeStavioOglas;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Reakcija> getReakcija() {
        return reakcije;
    }
    public void reaguj (String imePrezime, String reakcija){
        Reakcija trenutni = new Reakcija(reakcija,imePrezime);
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getImePrezimeKoJeReagovao().equals(imePrezime)){
                this.reakcije.remove(i);
            }
        }
        this.reakcije.add(trenutni);
        if (reakcija.equals("smajli")) System.out.println(imePrezime + " - daje smajli");
        if (reakcija.equals("srce")) System.out.println(imePrezime + " - daje srce");
        if (reakcija.equals("like")) System.out.println(imePrezime + " - lajkuje");
        if (reakcija.equals("cry")) System.out.println(imePrezime + " - place");
    }
    private int vratiBrojReakcija(String reakcija){
        int count = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTipReakcije().equals(reakcija)){
                count++;
            }
        }
        return count;
    }
    public void stampaj (){
        System.out.println(this.imePrezimeKoJeStavioOglas);
        System.out.println(this.text);
        String ispis = "";
        if (this.vratiBrojReakcija("smajli") > 0){
            ispis += "Smajli " + this.vratiBrojReakcija("smajli") + " | ";
        }
        if (this.vratiBrojReakcija("like") > 0){
            ispis += "Like " + this.vratiBrojReakcija("like") + " | ";
        }
        if (this.vratiBrojReakcija("srce") > 0){
            ispis += "Srce " + this.vratiBrojReakcija("srce") + " | ";
        }
        if (this.vratiBrojReakcija("cry") > 0){
            ispis += "Cry " + this.vratiBrojReakcija("cry") + " | ";
        }
        ispis = ispis.substring(0,ispis.length()-3);
        System.out.println(ispis);
    }


}




