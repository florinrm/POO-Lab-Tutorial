package lab3demo;

import java.util.Objects;

public class Singer {
    private String name;
    private String genre;

    public Singer(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return name + " " + "| genre: " + genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Singer)) return false;
        Singer singer = (Singer) o;
        return name.equals(singer.name) &&
                genre.equals(singer.genre);
    }
}
