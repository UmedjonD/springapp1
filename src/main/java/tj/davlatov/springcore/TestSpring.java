package tj.davlatov.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.Callable;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();

//        System.out.println(classicalMusic.getSong());

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();
//
//        boolean comparasion = musicPlayer1 == musicPlayer2;
//
//        System.out.println(comparasion);
//        System.out.println(musicPlayer1.getName() + " " + musicPlayer1.getVolume());
//        System.out.println(musicPlayer2.getName() + " " + musicPlayer2.getVolume());



        context.close();

    }
}
