package lab1demo;

public class DemoLab1 {
    public static void main(String[] args) {
        // asa afisam la consola - echivalentul lui printf din C / cout din C++
        System.out.println("Cui ii plac manelele + abi?");

        Song s1 = new Song(); // ca sa cream un obiect, care reprezinta instanta unei clase
        // folosim keyword-ul new - fiecare clasa are un constructor default, fara argumente

        s1.setArtistName("abi talent");
        s1.setTitle("$cuze");
        s1.setYear(2019);

        Song s2 = new Song();
        s2.setArtistName("Florin Salam");
        s2.setTitle("Striga lumea dupa mine sefule");
        s2.setYear(2018);

        Song s3 = new Song();
        s3.setArtistName("Adi Minune");
        s3.setTitle("Asa sunt zilele mele");
        s3.setYear(2001);

        Song[] playlist = new Song[3];
        playlist[0] = s1;
        playlist[1] = s2;
        playlist[2] = s3;
    }
}
