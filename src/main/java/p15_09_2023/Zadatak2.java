package p15_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        VisaKartica visa= new VisaKartica(12360, "2244 5544 1235 6655", 24, 11, "Pera Peric");

        MasterKartica master = new MasterKartica(2255, "4566 2211 2588 9874", 25, 5);

     //   visa.transakcija();

        master.dodajOdrzavanje();
    //    master.dodajProviziju();

        visa.stampaj();
        master.stampaj();



    }
}
