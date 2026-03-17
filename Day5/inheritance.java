package Day5;

interface MusicPlayerInterface {
    public void on();

    public void off();

    public void play();

    public void pause();
}

class MusicPlayer implements MusicPlayerInterface {
    public void on() {
        System.out.println("Music On");
        int a = 5 , b = 6;
        System.out.println("Sum = " + (a + b));
    }
 
    public void off() {
        System.out.println("Music Off");
    }

    public void play() {
        System.out.println("Music Play");
    }

    public void pause() {
        System.out.println("Music Pause");
    }
}

public class inheritance extends MusicPlayer {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();

        mp.on();
        mp.off();
        mp.play();
        mp.pause();
    }
}