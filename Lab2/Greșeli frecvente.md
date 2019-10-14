# Greșeli frecvente - labul 2
## Apelarea unui constructor în alt constructor
Ca să apelăm un constructor în alt constructor, în cadrul aceleiași clase, folosim `this`.

Exemplu:

```java
public class Student {
	private long id;
	private String name;
	private String surname;
	
	// primul constructor
	public Student(long id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	// al doilea constructor - aici apelam primul constructor 
	public Student() {
		// ASA NU
		// new Student(0, "no name", "no surname");
		
		// ASA DA
		this(0, "no name", "no surname");
	}
}
```

## Constructorul nu are tip de retur
În Java, constructorul / constructorii unei clase nu au **niciodată** tip de retur. Ele sunt singurele metode care nu au **niciodată** tip de retur.

Exemplu:
```java
// ASA DA
public class Student {
	private long id;
	private String name;
	private String surname;
	
	// ASA DA
	public Student(long id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	// ASA NU
	/*
	// chiar daca in constructor nu returnam nimic, nu punem void
	public void Student(long id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	*/
}
```

## Alocarea memoriei obiectelor într-un array de obiecte
Asta s-a observat și la laboratorul 2. Am detaliat [aici](https://github.com/florinrm/POO-Lab-Tutorial/blob/master/Lab1/Gre%C8%99eli%20frecvente.md), la labul 1.
