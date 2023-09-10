package p08_09_2023;

public class Auto {

    public String vozac;
    public String marka;
    public int brojVrata;
    public double potrosnjaNa100km;
    public int trenutnaBrzina;
    public int registrovanDo;
    public int godinaProizvodnje;
    public int kubikaza;
    public boolean ukljucenaKlima;
    public String registracija;
    public int maxBrzina;


    public boolean stampaj() {
        System.out.println(this.vozac);
        System.out.println(this.marka + " - " + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnjaNa100km + " l na 100km");
        System.out.println(this.trenutnaBrzina + "km/h je trenutna brzina.");
        System.out.println("Cena registracije " + this.cenaRegistracije);
        System.out.println("Old timer " + this.oldiTmer);


        public boolean jePrekoracio ( int ogranicenje){
            return this.trenutnaBrzina > ogranicenje;
        }
        //83, 80 => 3 * 1000;
        //public int kazna (int ogranicenje) {
        // if (this.jePrekoracio(ogranicenje)) {
        // return (this.trenutna.Brzina - ogranicenje)*1000
        // } return 0;
        // }

        public double novcanaKazna ( int ogranicenjeBrzine){
            if (this.jePrekoracio(ogranicenjeBrzine)) {
                double razlika = this.trenutnaBrzina - ogranicenjeBrzine;
                return razlika * 1000.00;
            }
            return 0.0;

            public boolean oldiTmer () {
                return this.godinaProizvodnje < 1950;
            }
            //if (this.godinaProizvodnje < 1950) {
            // return true;
            // } else {
            // return false;
            //}

            public boolean registrovan ( int trenutniMesec){
                return this.registrovanDo < trenutniMesec;
            }

            // if (this.registrovanDo < trenutniMesec) {
            //   return true;
            // } else {
            //    return false;
            //  }

            public double cenaRegistracije () {
                double cena = this.kubikaza * 100.0;
                if (this.kubikaza > 2000) {
                    cena = cena * 1.3;
                }
                return cena;
            }

            public void dodajGas () {
                int brzina = this.trenutnaBrzina + 10;
                if (brzina < this.maxBrzina) {
                    this.trenutnaBrzina += 10;
                } else {
                    this.trenutnaBrzina = this.maxBrzina;
                }
            }

            public void koci () {
                int brzina = this.trenutnaBrzina - 10;
                if (brzina > 0) {
                    this.trenutnaBrzina = brzina;
                } else {
                    this.trenutnaBrzina = 0;
                }
            }

            public double racunajFaktorKlime () {
                double faktorKlime = 1.0;
                if (this.ukljucenaKlima) {
                    faktorKlime = 1.2;
                }
                return faktorKlime;
            }

            public double trenutnaPotrosnja () {
                double klima = 1.0;
                if (ukljucenaKlima) {
                    klima = 1.2;
                }
                return (this.trenutnaBrzina / 100 * this.potrosnjaNa100km) * klima;
            }

            public void stampajTablu () {
                int brzina = (this.trenutnaBrzina * 100) / this.maxBrzina;
                for (int i = 0; i < 100; i++) {
                    if (i < brzina) {
                        System.out.println("|");
                    } else {
                        System.out.println(".");
                    }
                }
                System.out.println(this.trenutnaBrzina + " / " + this.maxBrzina + "km/h");
            }
        }

    }

    public boolean jePrekoracio(int ogranicenjeNaPutu) {
        return false;
    }

    public Object dodajgas(){
        return null;
    }

    public Object koci(){
        return null;
    }

    public String novcanaKazna(int ogranicenjeNaPutu) {
        return null;
    }

    public boolean odlTimer() {
        return false;
    }

    public boolean registrovan(int i) {
        return null;
    }

    public String cenaRegistracije() {
        return null;
    }

    public String trenutnaPotrosnja() {
        return null;
    }

    public Object stampajTablu() {
        return null;
    }

    public boolean registrovanDo(int i) {
        return false;
    }
}