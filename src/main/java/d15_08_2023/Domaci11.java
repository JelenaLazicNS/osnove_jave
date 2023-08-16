package d15_08_2023;

public class Domaci11 {
    public static void main(String[] args) {

        String nazivSlike = "profile-image.log";

        int a = 0, b = 0, rezolucijaKb = 0;
        double rezolucijaMb = 0;

        a = 1920;
        b = 1080;

        rezolucijaKb = (a*b)/1024;
        rezolucijaMb = 1.0*rezolucijaKb/1024;


        System.out.println("File: "+nazivSlike);
        System.out.println("Resolution: "+a+ " x "+b);
        System.out.println("Size(kb): "+rezolucijaKb);
        System.out.println("Size(Mb): "+rezolucijaMb);


    }
}
