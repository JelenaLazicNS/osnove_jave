package d11_09_2023;

public class YoutubePlayer {

    private int kvalitet;
    private String rezim;
    private int jacinaZvuka;
    private int trenVreme;
    private Video video;

    public YoutubePlayer () {
        this.jacinaZvuka = 75;
        this.kvalitet = 144;
        this.rezim = "mini player";
    }
    public void vremeReprodukcije(Video video) {
        this.video = video;
        this.trenVreme = 0;
        video.brPregleda();
    }
    public void pojacaj() {
        if (jacinaZvuka + 10 <= 100) {
            jacinaZvuka += 10;
        }
    }

    public void utisaj() {
        if (jacinaZvuka - 10 >= 0) {
            jacinaZvuka -= 10;
        }
    }

    public void postaviKvalitet(int brzinaNeta) {
        if (brzinaNeta < 2) {
            kvalitet = 144;
        } else if (brzinaNeta <= 4) {
            kvalitet = 240;
        } else if (brzinaNeta <= 6) {
            kvalitet = 360;
        } else if (brzinaNeta <= 8) {
            kvalitet = 720;
        } else {
            kvalitet = 1080;
        }
    }
    public void aktivirajMiniPlayerMod() {
        rezim = "mini plejer";
    }

    public void aktivirajBioskopskiMod() {
        rezim = "bioskopski";
    }

    public void aktivirajPrekoCelogEkranaMod() {
        rezim = "preko celog ekrana";
    }

    public void premotajUnapred() {
        int newTime = trenVreme + 10;
        trenVreme = Math.min(newTime, video.getDuzina());
    }

    public void premotajUnazad() {
        int newTime = trenVreme - 10;
        trenVreme = Math.max(newTime, 0);
    }

    public void iscrtajZvuk() {
        int brCrtica = jacinaZvuka / 10;
        System.out.print("<: ");
        for (int i = 0; i < brCrtica; i++) {
            System.out.print("|");
        }
        System.out.println();
    }

    public void iscrtajRezim() {
        if (rezim.equals("mini plejer")) {
            System.out.println("[ ]");
        } else if (rezim.equals("bioskopski")) {
            System.out.println("[..]");
        } else if (rezim.equals("preko celog ekrana")) {
            System.out.println("[||||]");
        }
    }

   // public void iscrtajTrenutnoVreme() {
     //   int minuti = trenVreme / 60;
       // int sekunde = trenVreme % 60;
        //int ukupnoMinuti = video.getDuzina() / 60;
      //  int ukupnoSekunde = video.getDuzina()) % 60;
     //   System.out.println("Minuti: "+minuti+" sekunde: "+sekunde+ " ukupno minuti: "+ukupnoMinuti+ " ukupno sekunde: "+ukupnoSekunde);
  //  }

    public void iscrtajTimeline() {
        int zvezdice = trenVreme * 100 / video.getDuzina();
        int tackice = 100 - zvezdice;
        StringBuilder timeline = new StringBuilder();
      //  for (int i = 0; i < zvezdice; i++) {
        System.out.println("*");
        }
       // for (int i = 0; i < tackice; i++) {
      //      System.out.println(".");;
        }

   // public void stampaj() {
     //   System.out.print(trenVreme + ":");
       // iscrtajTrenutnoVreme ();
        //iscrtajZvuk();
        //iscrtajTimeline();
      //  System.out.println("Kvalitet: " + kvalitet + "p");
      //  System.out.print("Summary: ");
      //  iscrtajRezim();
      //  System.out.println(video.getNaziv());
      //  System.out.println("Lajkovi " + video.getBrLike() + " | Dislajkovi " + video.getBrDislike());
      //  System.out.println(video.getBrPregleda() + " Broj pregleda");
  //  }

   // public String shareVideo() {
    //    return "https://youtu.be/" + video.getId();
   // }
   // }




