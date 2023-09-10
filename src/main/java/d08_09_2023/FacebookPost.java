package d08_09_2023;

public class FacebookPost {

    public String imePrezimeKorisnika;

    public String imePrezimeProfila;

    public String tekstObjave;

    public int brojLike;

    public int brojShare;

    public void like(){
        this.brojLike+=1;
    }

    public void dislike(){
        if(this.brojLike>0)
            this.brojLike-=1;
    }

    public void share(){
        this.brojShare+=1;
    }

    public void print(){
        System.out.println("("+this.imePrezimeKorisnika+")" + " >>> " + "("+this.imePrezimeProfila+")");
        System.out.println(this.tekstObjave);
        System.out.println("Likes ("+this.brojLike+") | Shares ("+this.brojShare+")");
    }
}
