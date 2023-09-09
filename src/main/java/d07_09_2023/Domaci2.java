package d07_09_2023;

public class Domaci2 {
    public static void main(String[] args) {

        Automobili a = new Automobili();
        a.model = "VW";
        a.marka = "Sharan";
        a.godinaProizvodnje = 2015;

        Automobili b = new Automobili();
        b.model = "Opel";
        b.marka = "Corsa";
        b.godinaProizvodnje = 2007;

        Automobili c = new Automobili();
        c.model = "Reno";
        c.marka = "Clio";
        c.godinaProizvodnje = 2010;

        System.out.println("Model automobila: "+a.model+", marka: "+a.marka+", godina proizvodnje: "+a.godinaProizvodnje);
        System.out.println("Model automobila: "+b.model+", marka: "+b.marka+", godina proizvodnje: "+b.godinaProizvodnje);
        System.out.println("Model automobila: "+c.model+", marka: "+b.marka+", godina proizvodnje: "+c.godinaProizvodnje);
    }
}
