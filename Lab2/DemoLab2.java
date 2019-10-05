package lab2demo;

public class DemoLab2 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p);

        Person p1 = new Person("Florin", "Mihalache", "Focsani", 420);
        Person p2 = new Person("Sorin", "Bodas", "Focsani", 69);

        System.out.println(p1);
        System.out.println(p2);

        // acum p2 are fix acceasi referinta ca p1
        System.out.println("Copierea referintelor");
        p2 = p1;

        System.out.println(p1);
        System.out.println(p2);

        p2.setId(6969);

        System.out.println(p1);
        System.out.println(p2);

        p1.setName("Malone");
        System.out.println(p1);
        System.out.println(p2);

        // acum copiem p in p2
        System.out.println("Copierea obiectelor");
        p2 = new Person(p);
        System.out.println(p);
        System.out.println(p2);

        // cu == comparam referintele obiectelor (adica adresele obiectelor)
        // dar nu se compara si valoarea obiectelor (aici folosim metoda equals - remember lab 1)

        // compararea referintelor
        System.out.println(p2 == p); // p si p2 nu reprezinta acceasi referinta

        // compararea valorilor din obiecte
        System.out.println(p2.equals(p));
    }
}
