package lab3demo;

public class DemoLab3 {
    public static void main(String[] args) {
        //
        Singer singer1 = new Singer("Parazitii", "Hip-hop");
        Song song1 = new Song("Antimilitie", "Lovitura de pedeapsa", 2019, singer1);
        Song song2 = new Song("Toate-s la fel",  2012, singer1);
        System.out.println(song1);
        System.out.println(song2);
    }
}
