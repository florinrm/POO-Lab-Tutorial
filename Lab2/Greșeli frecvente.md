# Greșeli frecvente - labul 2
// TODO

// constructorul nu are tip de retur

// alocarea obiectelor intr-un array de obiecte - check lab 1

// apelarea unui constructor din alt constructor (this)
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
