package p18_09_2023;

public class JednakostranicniTrougao extends Figura{
    public int strA;

    public JednakostranicniTrougao(int strA) {
        super();
        this.strA = strA;
    }

    public int getStrA() {
        return strA;
    }

    public void setStrA(int strA) {
        this.strA = strA;
    }


    public double povrsina() {
        return 0;
    }


    public double obim() {
        return 0;
    }

    @Override
    public double povrsina(double pov) {
        pov = (strA*strA)*1.732052/4;
        return pov;
    }
    @Override
    public double obim(double ob) {
        ob = strA*3;
        return ob;
    }

    public void stampaj() {
        System.out.println("("+this.povrsina()+")");
        System.out.println("("+this.obim()+")");

    }
}
