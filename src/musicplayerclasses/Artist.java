package musicplayerclasses;

public class Artist {

    private String artistName;
    private String genre;

    //default constructor
    public Artist() {}

    //non-default constructor
    public Artist(String artistName, String genre) {
        this.artistName = artistName;
        this.genre = genre;
    }

    //getters and setters
    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //toString() method for printing to the user
    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
