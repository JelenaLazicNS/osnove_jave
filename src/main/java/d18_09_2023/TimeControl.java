package d18_09_2023;

public class TimeControl extends ControlC {
    public TimeControl() {
    }

    public TimeControl(boolean pomeraVreme) {
        this.pomeraVreme = pomeraVreme;
    }
    public boolean pomeraVreme;


    @Override
    public void execute(VideoPlayer videoPlayer) {
        if (this.pomeraVreme) {
            if (videoPlayer.getTrenutnoVreme() + 15 <= videoPlayer.getDuzinaVidea()) {
                videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() + 15);
            } else {
                videoPlayer.setTrenutnoVreme(videoPlayer.getDuzinaVidea());
            }
        }  else {
            if (videoPlayer.getTrenutnoVreme() - 15 > 0){
                videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() - 15);
            } else {
                videoPlayer.setTrenutnoVreme(0);
            }
        }
    }

    public boolean isPomeraVreme() {
        return pomeraVreme;
    }

    public void setForward(boolean forward) {
        pomeraVreme = forward;
    }
}
