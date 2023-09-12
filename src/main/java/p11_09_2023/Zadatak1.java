package p11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Student prvi = new Student();
        prvi.setIme("Milan");
        prvi.setPrezime("Petrovic");
        prvi.setBrIndexa(123);
        prvi.setNaBudzetu(true);

        prvi.stampaj();
    }
}
