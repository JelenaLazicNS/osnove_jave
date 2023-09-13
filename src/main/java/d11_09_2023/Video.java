package d11_09_2023;

public class Video {
 private String id;
 private String naziv;
 private int duzina;
 private int brLike;
 private int brDislike;
 private int brPregleda;

 public Video (String id, String naziv, int duzina) {
     this.id = id;
     this.naziv = naziv;
     this.duzina = duzina;
     this.brLike = 0;
     this.brDislike = 0;
     this.brPregleda = 0;
 }

    public String getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getDuzina() {
        return duzina;
    }

    public int getBrLike() {
        return brLike;
    }

    public int getBrDislike() {
        return brDislike;
    }

    public int getBrPregleda() {
        return brPregleda;
    }

    public void brLike() {
     brLike++;
    }
    public void brDislike () {
     brDislike++;
    }
    public void brPregleda () {
     brPregleda++;
    }

    public void stampaj() {
        System.out.println("Naziv ");
        //    //        System.out.println("Video Name: " + video.getName());
        //    //        System.out.println("Video Length: " + video.getLengthInSeconds() + " seconds");
        //    //        System.out.println("Likes: " + video.getLikes());
        //    //        System.out.println("Dislikes: " + video.getDislikes());
        //    //        System.out.println("Views: " + video.getViews());
        //    //    }
    }

}
