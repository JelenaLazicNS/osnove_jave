package d12_09_2023;

public class Domaci1 {
    public static void main(String[] args) {

        FizickoLice prodavac = new FizickoLice("Jelena Lazic", "55448999552", "354635");
        FizickoLice kupac = new FizickoLice("Aleksandar Lazic", "6463541354", "554634");

        Ugovor ugovor = new Ugovor(2023, 10, "Septembar", 40000, "Bulevar Oslobodjenja 44, Novi Sad", kupac, prodavac);
        ugovor.stampaj();


    }
}
