package p14_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        FacebookPost post = new FacebookPost("Pera Peric", "Cao!");

        //Reakcija reakcija1 = new Reakcija("Like", "Pera");
      //  Reakcija reakcija2 = new Reakcija("Srce", "Zika");
      //  Reakcija reakcija3 = new Reakcija("Smile", "MIka");
      //  Reakcija reakcija4 = new Reakcija("like", "Sara");
      // Reakcija reakcija5 = new Reakcija("hgkj", "Mara");

        post.reaguj("Sima", "like");
        post.reaguj("Zika", "smile");
        post.reaguj("Mika", "srce");
        post.reaguj("Jova", "smile");
        post.reaguj("Sava", "like");


        System.out.println();

        post.stampaj();
    }
}
