package d25_08_2023;

public class Domaci4 {
    public static void main(String[] args) {
        //Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
        //Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
        /// / / / /
        //Napomena: Metoda nista ne vraca.ž

        karakteri(5, "/");


    } public static void karakteri (int x, String A) {
        for (int i=0; i<x; i++); {
            System.out.print(A+" ");
        }
    }
}
