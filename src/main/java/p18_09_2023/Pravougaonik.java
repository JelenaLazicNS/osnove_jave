package p18_09_2023;

public class Pravougaonik extends Figura{
    public int a;
    public int b;

    public Pravougaonik(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double povrsina() {
        return 0;
    }

    @Override
    public double obim() {
        return 0;
    }

    @Override
    public double povrsina(double povPrav) {
        povPrav = a*b;
        return povPrav;
    }

    @Override
    public double obim(double obPrav) {
        obPrav = (2 * a) + (2 * b);
        return obPrav;
    }

    public void stampaj() {
        System.out.println("("+this.povrsina()+")");
        System.out.println("("+this.obim()+")");
    }
}
