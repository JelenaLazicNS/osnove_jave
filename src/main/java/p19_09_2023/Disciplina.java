package p19_09_2023;

import java.util.ArrayList;
import java.util.List;

public class Disciplina  {
    private String imeDiscipline;
    private String tipDiscipline;
    private List<Atleticar> atlete;

    public Disciplina (){
        atlete = new ArrayList<Atleticar>();

    }

    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;
        atlete = new ArrayList<Atleticar>();
    }
    public void dodajAtleticara (Atleticar a){
        this.atlete.add(a);
    }

    public void diskvalifikuj (String imePrezime){
        for (int i = 0; this.atlete.size() > i; i++){
            if(this.atlete.get(i).getImePrezime().equals(imePrezime)){
                this.atlete.remove(i);
            }

        }
    }

    public Atleticar nadjiNajboljeg(){
        if (this.atlete.isEmpty()){
            return null;
        }
        Atleticar najbolji =this.atlete.get(0);
        for(Atleticar atleticar : this.atlete){
            if (atleticar.daLiJeBolji(najbolji)){
                najbolji = atleticar;
            }
        } return najbolji;
    }
    private Atleticar vratiNajboljeg(){
        Atleticar a = this.atlete.get(0);
        for (int i =1; i<this.atlete.size(); i++){
            if (this.atlete.get(i).daLiJeBolji(a)){
                a =this.atlete.get(i);
            }
        } return a;
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public void stampajPobednika(){
        this.vratiNajboljeg().stampaj();
    }
}
