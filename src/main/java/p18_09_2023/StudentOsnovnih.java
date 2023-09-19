package p18_09_2023;

public class StudentOsnovnih extends StudentAb{

    public StudentOsnovnih(String imePrezime, int brIndexa, int godinaStudija) {
        super(imePrezime, brIndexa, godinaStudija);
    }


    @Override
    public int cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean naBudzetu() {
        if (this.godinaStudija < 5) {
            return true;
        } else {
            return false;
        }
        }

}
