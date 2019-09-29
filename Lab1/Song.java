package lab1demo;

// o clasa ce caracterizeaza o melodie
public class Song {
    private String artistName; // artistul ce canta melodia
    private String title; // numele melodiei
    private int year; // anul de lansare a melodiei

    // mai jos avem proprietatile, cu ajutorul carora putem accesa campurile private din afara clasei
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
