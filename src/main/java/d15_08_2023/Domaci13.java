package d15_08_2023;

public class Domaci13 {
    public static void main(String[] args) {

        String nazivVidea = "Tea Tairovic - Bibi Habibi (Official Video / Album Balerina)";
        String duzinaFile = "2:29";
        int duzinaVidea = 0, brojFrame = 0;
        int a = 0, b =0;
        double rezolucija = 0, brzinaInterneta = 0;

        duzinaVidea = 2*60+29;
        brojFrame = 20;
        a = 1920;
        b = 1080;
        rezolucija = a * b;
        brzinaInterneta = (rezolucija/(1024*1024))*brojFrame;

        System.out.println("*********************************************");
        System.out.println(nazivVidea);
        System.out.println(duzinaFile+ "  <|||||");
        System.out.println("Number of frames per second: "+brojFrame);
        System.out.println("Resolution: "+a+"x"+b);
        System.out.println("Minimal network speed: "+brzinaInterneta+"Mb/s");

    }
}
