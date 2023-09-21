package d18_09_2023;

public class Domaci1 {
    public static void main(String[] args) {
        VideoPlayer videoPlayer1 = new VideoPlayer();

        TimeControl timeForward = new TimeControl(true);
        timeForward.execute(videoPlayer1);
        timeForward.execute(videoPlayer1);
        timeForward.execute(videoPlayer1);
        timeForward.execute(videoPlayer1);

        TimeControl timeBackward = new TimeControl(false);
        timeBackward.execute(videoPlayer1);

        AudioControl volumeUp = new AudioControl(true);
        volumeUp.execute(videoPlayer1);
        volumeUp.execute(videoPlayer1);
        volumeUp.execute(videoPlayer1);

        AudioControl volumeDown = new AudioControl(false);
        volumeDown.execute(videoPlayer1);

        QualityOptimizerControl quality = new QualityOptimizerControl(50);
        quality.execute(videoPlayer1);

        videoPlayer1.stampaj();

    }
    }
