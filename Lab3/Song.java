package lab3demo;

public class Song {
    private String title; // compunere - o melodie are un titlu
    private String album = null; // agregare - un cantec poate sa nu fie lansat pe un album
    private int releaseYear; // compunere - o melodie are un an de lansare
    private Singer singer; // compunere - o melodie are un cantaret
    // asta inseamna ca Song si Singer sunt intr-o relatie de tip HAS-A (Song has a Singer)

    public Song(String title, int releaseYear, Singer singer) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.singer = singer;
    }

    public Song(String title, String album, int releaseYear, Singer singer) {
        this.title = title;
        this.album = album;
        this.releaseYear = releaseYear;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        if (album != null)
            return title + " was released in " + releaseYear
                + ", appearing on " + album + ", sung by " + singer.getName();
        return title + " was released in " + releaseYear
                + ", sung by " + singer.getName();
    }
}
