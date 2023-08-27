package p25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        mata(x,y);
        mata(x*2, y*2);
        mata(10, 4);

    } public static void mata (int a, int b) {
        int suma = a+b;
        int proizvod = a*b;
        int kolicnik = a/b;
        int razlika = a-b;

        System.out.println("A: "+a);
        System.out.println(("B: "+b));
        System.out.println("Suma " + suma );
        System.out.println("Proizvod "+proizvod);
        System.out.println("Kolicnik" +kolicnik);
        System.out.println("Razlika " +razlika);
    }
}
//public class Main {
//  static int myMethod(int x, int y) {
//    return x + y;
//  }
//
//  public static void main(String[] args) {
//    System.out.println(myMethod(5, 3));
//  }
//}
//// Outputs 8 (5 + 3)