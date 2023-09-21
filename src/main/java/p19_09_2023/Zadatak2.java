package p19_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Trkac trkac1 = new Trkac("Pera Peric", 23.5);
        Trkac trkac2 = new Trkac("Sonja Simic", 15.8);
        Skakac skakac1 = new Skakac("Zoran Cosic", 3.5);
        Skakac skakac2 = new Skakac("Masa Boric", 4.2);

        Disciplina skokUDalj = new Disciplina("skok u dalj", "skakac");
        Disciplina saPreponama = new Disciplina("100m sa preponama", "trkac");



        skokUDalj.dodajAtleticara(skakac1);
        skokUDalj.dodajAtleticara(skakac2);

        skokUDalj.diskvalifikuj("Zoran Cosic");
        skokUDalj.stampajPobednika();

        saPreponama.dodajAtleticara(trkac1);
        saPreponama.dodajAtleticara(trkac2);

        saPreponama.diskvalifikuj("Pera Peric");
        saPreponama.stampajPobednika();



    }
}
