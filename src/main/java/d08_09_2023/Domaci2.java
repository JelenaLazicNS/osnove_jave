package d08_09_2023;

public class Domaci2 {
    public static void main(String[] args) {

        FacebookPost post1 = new FacebookPost();
        post1.imePrezimeKorisnika = "Petar Petrovic";
        post1.imePrezimeProfila = "Zoran Jovanovic";
        post1.tekstObjave = "Srecan rodjendan!";


        FacebookPost post2 = new FacebookPost();
        post2.imePrezimeKorisnika = "Zoran Jovanovic";
        post2.imePrezimeProfila = "Petar Petrovic";
        post2.tekstObjave = "Hvala!";


        post1.like(); post1.like(); post1.like();
        post1.dislike();
        post1.share();
        post1.print();

        post2.like(); post2.like(); post2.like();
        post2.dislike();
        post2.share();
        post2.print();

    }
}
