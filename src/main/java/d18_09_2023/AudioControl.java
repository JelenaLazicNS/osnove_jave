package d18_09_2023;

public class AudioControl extends ControlC {
    public AudioControl() {
    }

    public AudioControl(boolean pojacava) {
        this.pojacava = pojacava;
    }

    public boolean pojacava;

    @Override
    public void execute (VideoPlayer videoPlayer) {
        if (this.pojacava) {
            if (videoPlayer.getJacinaZvuka() + 1 <= 100){
                videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() + 1);
            } else {
                videoPlayer.setJacinaZvuka(100);
            }
        }  else {
            if (videoPlayer.getJacinaZvuka() - 1 > 0){
                videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() - 1);
            } else {
                videoPlayer.setJacinaZvuka(0);
            }
        }
    }
    private boolean pojacava() {
        return false;
    }


    public boolean getPojacava() {
        return pojacava();
    }

    public void setPojacava(boolean pojacava) {
        this.pojacava = pojacava;
    }
}
