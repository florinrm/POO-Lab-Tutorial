# Greșeli frecvente - labul 2
// TODO

// constructorul nu are tip de retur

// alocarea obiectelor intr-un array de obiecte - check lab 1
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
