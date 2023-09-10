package p08_09_2023;


public class Zadatak1 {
    public static void main(String[] args) {

      SlackMessage_08 prvaPoruka = new SlackMessage_08();
      prvaPoruka.tekst = "Cao, sta radis?";
      prvaPoruka.imePrezime = "Maarko Petrovic";
      prvaPoruka.datumVreme = "26.08.2021 18:55";

      SlackMessage_08 drugaPoruka = new SlackMessage_08();
      drugaPoruka.tekst = "Ucim";
      drugaPoruka.imePrezime = "Pera Peric";
      drugaPoruka.datumVreme = "26.08.2021 19:05";

      prvaPoruka.stampaj ();
      drugaPoruka.stampaj ();

      prvaPoruka.update("Novi tekst", "26.08.2021 19:20" );
      System.out.println("*******");
      prvaPoruka.stampaj();

      String convertedInfo = prvaPoruka.convetrToString();

      System.out.println(convertedInfo);

        



    }

}
