package p14_09_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        InstagramUser user = new InstagramUser("jecke21","Jelena Lazic","jelena@mail.com");
        InstagramUser user2 = new InstagramUser("dlazic","Dejan Lazic","deki@mail.com");

        InstagramImage image = new InstagramImage(150,100,"instagram.com/korsnik-jecke21/profilna.jpg");

        InstagramTag tag = new InstagramTag(20,80,user);
        InstagramTag tag2 = new InstagramTag(150,60,user2);

        image.dodajTag(tag);
        image.dodajTag(tag2);

        InstagramPost post = new InstagramPost("Slika");
        post.dodajSliku(image);

        post.stampaj();


    }
}
