package musicplayerclasses;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album
{
    //properties
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    //default constructor
    public Album() {}

    //non-default constructor
    public Album(String name, String artist, ArrayList<Song> songs)
    {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    //when we want to add a song to our library
    public boolean addASong(String title, String artist, double duration)
    {
        //first check if the song exists
        if(songExists(title) != null)
        {
            //when song already exists
            System.out.println(title + " already exists");
            return false;
        }
        else //if song is missing in the library
        {
            //add the song
            songs.add(new Song(title,artist,duration));
            return true;
        }
    }

    //adding to the playlist
    public boolean addSongToPlaylist(int indexOfTrack, LinkedList<Song> songLinkedList)
    {
        //check if album has a specific track already

        return true;
    }

    public Song songExists(String title)
    {
        //go through the loop to check if the song exits
        for (Song songCheck : songs)
        {
            //checks if the song exists in our database
            if(songCheck.getTitle().equals(title))
                return songCheck;
        }

        return null;
    }

    //toString() method for printing to the user
    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artists=" + artist +
                ", songs=" + songs +
                '}';
    }
}
