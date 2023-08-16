package d15_08_2023;

public class Domaci12 {
    public static void main(String[] args) {

        String nazivSlike = "profile-image.png";
        int a = 0, b = 0;
        double rezolSlike = 0, faktorA = 0, faktorB = 0;

        a = 1920;
        b = 1080;
        rezolSlike = 1.0*(a*b)/(1024*1024);
        faktorA = rezolSlike * 0.8;
        faktorB = rezolSlike * 1.3;

        System.out.println("Original image: "+nazivSlike+ " Size: "+rezolSlike+"Mb");
        System.out.println("Scale: 1,3");
        System.out.println("Resized image: resized "+nazivSlike+ " Size: "+faktorB+"Mb");
        System.out.println("|Click here to download image|");



    }
}
