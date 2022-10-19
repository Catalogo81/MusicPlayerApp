package musicplayerclasses;
public class Song
{
    //properties
    private String title;
    private String artist;
    private double duration;

    //default constructor
    public Song() {
    }

    //non-default constructor
    public Song(String title,String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    //toString() method for printing to the user
    @Override
    public String toString() {
        return "Song Title: " + title + '\n' +
                "Song Artist: " + artist + '\n' +
                "Song Duration: " + duration;
    }
}
