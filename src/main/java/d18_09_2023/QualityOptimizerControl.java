package d18_09_2023;

public class QualityOptimizerControl extends ControlC {
    public double brzinaNeta;

    public QualityOptimizerControl(double netSpeedMBs) {
        this.brzinaNeta = netSpeedMBs;
    }

    @Override
    public void execute (VideoPlayer videoPlayer) {
        double quality = this.brzinaNeta * 10.1;
        if (quality < 144) {
            videoPlayer.setKvalitetVidea(144);
        }  else if (quality < 240){
            videoPlayer.setKvalitetVidea(240);
        }   else if (quality < 360){
            videoPlayer.setKvalitetVidea(360);
        }  else if (quality < 480){
            videoPlayer.setKvalitetVidea(480);
        }  else if (quality < 720){
            videoPlayer.setKvalitetVidea(720);
        } else {
            videoPlayer.setKvalitetVidea(1080);
        }
    }

    public double getBrzinaNeta() {
        return brzinaNeta;
    }

    public void setBrzinaNeta(double brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }

}
