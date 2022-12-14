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
    public Album(String name, String artist)
    {
        this.name = name;
        this.artist = artist;
    }

    //when we want to add a song to our library
    public boolean addASong(String title, double duration)
    {
        //first check if the song exists
        if(songExists(title) == null)
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

    ////checking if song is on the playlist by track number, if not adding it
    public boolean addSongToPlaylist(int indexOfTrack, LinkedList<Song> songLinkedList)
    {
        //check if album has a specific track already
        int i = indexOfTrack - 1;
        if(i > 0 && i <= this.songs.size()) {
            songLinkedList.add(this.songs.get(i));
            return true;
        }

        System.out.println("album does not contain track");
        return false;
    }

    //checking if song is on the playlist by song title, if not adding it
    public boolean addSongToPlaylist(String title, LinkedList<Song> songLinkedList)
    {
        //check using enhanced for loop
        for(Song songCheck : this.songs) {
            if (songCheck.getTitle().equals(title)) {
                songLinkedList.add(songCheck);
                return true;
            }
        }
        System.out.println(title + " song not found in album");
        return false;
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
