package lab2demo;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String birthplace;
    private long id;

    public Person(String name, String surname, String birthplace, long id) {
        this.name = name;
        this.surname = surname;
        this.birthplace = birthplace;
        this.id = id;
    }

    public Person() {
        this("Cameliu", "Malone", "Bucuresti", 696969);
    }

    @Override
    public boolean equals(Object o) {
        // daca comparam obiectul cu el insusi => true
        if (this == o) return true;
        // daca o nu este instanta Person, false (caci nu putem compara un Person cu un Car de exemplu)
        if (!(o instanceof Person)) return false;
        // castam pentru ca o, ca Object, nu are campurile din clasa Person (id, name, surname, birthplace)
        Person person = (Person) o;
        return id == person.id &&
                name.equals(person.name) &&
                surname.equals(person.surname) &&
                birthplace.equals(person.birthplace);
    }

    public Person(Person p) {
        this.name = p.name;
        this.surname = p.surname;
        this.id = p.id;
        this.birthplace = p.birthplace;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", birthplace = '" + birthplace + '\'' +
                ", id = " + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
