package p_07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        SlackMessage a = new SlackMessage();
        a.tekstPoruke = "Cao, sta radis?";
        a.imePrezime = "Marko Markovic";
        a.datumVreme ="26.08.2021 18:55";

        SlackMessage b = new SlackMessage();
        b.tekstPoruke = "Cao, ucim.";
        b.imePrezime = "Slavko Mirkovic";
        b.datumVreme ="26.08.2021 19:05";

        System.out.println(a.imePrezime+" - "+a.datumVreme+" - "+a.tekstPoruke);
        System.out.println(b.imePrezime+" - "+b.datumVreme+" - "+b.tekstPoruke);

    }
}
