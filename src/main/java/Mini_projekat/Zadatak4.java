package Mini_projekat;

import java.util.Scanner;
public class Zadatak4 {
    public static void main(String[] args) {

        //Program od korisnika traži da unese naziv promenljive za zamenu i vrednost koja će biti
        // postavljena umesto te promenljive u komandi. Nakon svake zamene, program će prikazati
        // trenutnu komandu sa izmenama.
        //Komanda koja je koriscena za ovaj primer je
        //locust -f $LOCUSTFILE -u $NUMBER_OF_USERS -r $SPAWN_RATE -t $RUN_TIME --headless –host $HOST --html $HTML_FILE
        //Promenljivi delovi komande su
        //$LOCUSTFILE
        //$NUMBER_OF_USERS
        //$SPAWN_RATE
        //$RUN_TIME
        //$HOST
        //$HTML_FILE

        Scanner s = new Scanner(System.in);
        String komanda="locust -f $LOCUSTFILE -u $NUMBER_OF_USERS -r $SPAWN_RATE -t $RUN_TIME --headless –host $HOST --html $HTML_FILE";


        while (komanda.contains("$")){
            System.out.println("Komanda: " + komanda);
            System.out.print("Unesite naziv promenljive za zamenu: ");
            String promenljiva = s.next();
            System.out.println("Uneiste vrednost: ");
            String zamena = s.next();
            komanda = komanda.replace(promenljiva, zamena);

        }
        System.out.println(komanda);
    }

}
