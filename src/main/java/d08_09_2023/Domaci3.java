package d08_09_2023;

public class Domaci3 {
    public static void main(String[] args) {

        SmartAirConditioning klima = new SmartAirConditioning();
        klima.marka = "Samsung";
        klima.mode = "hladjenje";
        klima.izabranaTemp = 22;
        klima.potrosnjaHladjenje = 4;
        klima.potrosnjaGrejanje = 6;


        klima.stampaj();

        System.out.println("Mesecna potrosnja kW/h: "+klima.racunajMesecnuPotrosnju());
        System.out.println("Iznos racuna za klimu: "+klima.cenaPotrosnje());

    }
}
