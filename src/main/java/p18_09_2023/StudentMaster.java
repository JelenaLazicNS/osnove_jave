package p18_09_2023;

public class StudentMaster extends StudentAb{

    public StudentMaster(String imePrezime, int brIndexa, int godinaStudija) {
        super(imePrezime, brIndexa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 90000;
    }

    @Override
    public boolean naBudzetu() {
        if (this.godinaStudija < 2) {
            return true;
        } else {
            return false;
        }
    }

}
