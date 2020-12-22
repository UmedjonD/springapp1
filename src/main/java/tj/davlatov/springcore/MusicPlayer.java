package tj.davlatov.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
    private Music music;
    //IoC


    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
