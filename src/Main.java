import musicplayerclasses.Album;
import musicplayerclasses.Artist;
import musicplayerclasses.Song;

public class Main {
    public static void main(String[] args) {


        Song song1 = new Song();

        song1.setArtist("JayZ");
        song1.setTitle("We Fight");
        song1.setDuration(5.26);

        Album hipHop = new Album();

        //hipHop.addASong(song1.getTitle(), song1.getArtist(), song1.getDuration());

        System.out.println(song1);
        //System.out.println(song1.getTitle());

    }
}