import musicplayerclasses.Album;
import musicplayerclasses.Song;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Song song1 = new Song();
//
//        song1.setArtist("JayZ");
//        song1.setTitle("We Fight");
//        song1.setDuration(5.26);
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("HipHop", "JayZ");

        album.addASong("Empire State",  4.22);
        album.addASong("Forever Young",  4.22);
        album.addASong("Run This Town",  4.22);
        album.addASong("Otis",  4.22);
        album.addASong("The Story of O.J",  4.22);


        album = new Album("House Nation", "Euphonic");

        album.addASong("Dance",  4.22);
        album.addASong("Fever",  4.22);
        album.addASong("Oh Yes!", 4.22);


        album = new Album("Deep House", "Lento");

        album.addASong("Ayoba",  4.22);
        album.addASong("Adiwele",  4.22);
        album.addASong("Sunrise",  4.22);

        albums.add(album);
        //System.out.println(albums);

        //creating our playlist

        //System.out.println(song1);
        //System.out.println(song1.getTitle());
    }
}