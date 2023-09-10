package d08_09_2023;

public class SmartAirConditioning {

    public String marka;
    public int potrosnjaGrejanje;
    public int potrosnjaHladjenje;
    public int izabranaTemp;
    public String mode;

    public void stampaj () {
        System.out.println("Marka: "+marka+", mode: "+mode+", temperatura: "+izabranaTemp);
    }
    public int racunajMesecnuPotrosnju () {
        if(this.mode.equals("hladjenje"))
            return 30 * 15 * potrosnjaHladjenje;
        else return 30 * 15 * potrosnjaGrejanje;
        }

    public int cenaPotrosnje () {
        if(this.racunajMesecnuPotrosnju()<= 350)
            return this.racunajMesecnuPotrosnju()*6;
        else return this.racunajMesecnuPotrosnju()*9;
        }
    }
