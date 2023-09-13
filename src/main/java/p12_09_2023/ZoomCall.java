package p12_09_2023;

public class ZoomCall {

    private String link;
    private String password;

    private Korisnik host;
    private Korisnik guest;

    public ZoomCall (String link, String password, Korisnik host) {
        this.link = link;
        this.password = password;
        this.host = host;
    }

    public ZoomCall (String link, String password, Korisnik host, Korisnik guest) {
        this.link = link;
        this.password = password;
        this.host = host;
        this.guest = guest;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Korisnik getGuest() {
        return guest;
    }
    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public Korisnik getHost() {
        return host;
    }
    public void setHost(Korisnik host) {
        this.host = host;
    }
    public void stampaj() {
        System.out.println("Zoom call: "+this.link);
        System.out.println("Password: "+this.password);
        System.out.println("Host: "+this.host);
        if(this.guest != null) {
            System.out.println("Guest: " + this.guest.getImePrezime());
        }
    }
}
