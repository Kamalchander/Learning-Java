package Day5;

interface Camera{
    void takePhoto();
}

interface MusicPlayer{
    void playMusic();
}

public class Smartphone implements Camera , MusicPlayer{
    @Override
    public void takePhoto() {
        System.out.println("Taking the Photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing the Music");
    }
}
