package d25_08_2023;

public class Domaci1 {
    public static void main(String[] args) {
        //Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena
        // vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        stampajVrednostZa10Vecu(2);
        stampajVrednostZa10Vecu(15);
        stampajVrednostZa10Vecu(120);


    }
    public static void stampajVrednostZa10Vecu(int broj){
        System.out.println(broj+10);
    }
}
