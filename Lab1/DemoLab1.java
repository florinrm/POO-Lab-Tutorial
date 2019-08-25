class Book {
    private String author;
    private String title;
    private int year;

    public Book (String author, String title, int an) {
        /*
        pentru ca parametrul dat la constructor (author) are acelasi
        nume cu campul author din clasa Book, trebuie sa folosim
        this, caci altfel nu se va atribui nicio valoare campului author din clasa
         */
        this.author = author;
        this.title = title;
        year = an;
    }

    // proprietate - incapsuleaza un camp privat, care nu poate fi accesat din exteriorul clasei

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

public class DemoLab1 {

    // acest main functioneaza ca cel din C/C++
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
