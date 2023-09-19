package p18_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        StudentOsnovnih student1 = new StudentOsnovnih("Pera Peric", 123, 3);
        StudentMaster student2 = new StudentMaster("Marko Markovic", 322, 5);

        student1.cenaSkolarine();
        student1.naBudzetu();
        student1.stampaj();
        student2.cenaSkolarine();
        student2.naBudzetu();
        student2.stampaj();

    }
}
