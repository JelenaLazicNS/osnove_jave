package p08_09_2023;

public class SlackMessage_08 {

    public String tekst;

    public String imePrezime;

    public String datumVreme;

    public  String lastUpdate;



    public void stampaj () {
        System.out.println((this.tekst));
        System.out.println(this.imePrezime);
        System.out.println(this.datumVreme);
        }

        public String convetrToString () {
            String result = imePrezime + " - "+ datumVreme + " - "+ tekst;
            return result;
        }

        public void update (String newText, String newTime) {
        this.tekst = newText;
        this.lastUpdate = newTime;
        }




    }


