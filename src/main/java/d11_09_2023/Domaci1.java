package d11_09_2023;

public class Domaci1 {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Stevan", "Sremac");
        Knjiga knjiga1 = new Knjiga("9788663692350", "Pop Cira i pop Spira", 1894, "Stevan", "Sremac");

        knjiga1.setAutor(autor1);
        knjiga1.stampaj();

        Autor autor2 = new Autor("Borislav", "Pekic");
        Knjiga knjiga2 = new Knjiga("6547647", "Vreme cuda", 1965, "Borislav", "Pekic" );

        knjiga2.setAutor(autor2);
        knjiga2.stampaj();

        Autor autor3 = new Autor("Ivo", "Andric");
        Knjiga knjiga3 = new Knjiga("63543654", "Prokleta avlija", 1954, "Ivo", "Andric");

        knjiga3.setAutor(autor3);
        knjiga3.stampaj();

    }
}
