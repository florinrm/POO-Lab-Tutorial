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

    @Override
    public boolean equals (Object obj) {
        // daca obj nu este nicidecum de tip Song, returnam false
        if (!(obj instanceof Song))
            return false;
        // buuun, deci obj este de fapt o instanta a lui Song
        // asadar trebuie sa castam obj la Song (stati chill, e asa ca sa vedeti acum)
        // in detaliu veti invata in laburile urmatoare
        Song s = (Song) obj;
        return s.title.equals(this.title) && s.artistName.equals(this.artistName) && this.year == s.year;
    }
}
