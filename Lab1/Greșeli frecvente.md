# Greșeli frecvente - lab 1
## Scrierea instrucțiunilor în clase
În Java, spre deosebire de C, instrucțiunile trebuie să fie scrise în metode (adică funcții), iar metodele trebuie să fie implementate în clase.

Așa nu:
- exemplul 1
```java
public class SomeClass {
	System.out.println("Nu scriem println in afara metodelor"); 
	// dar o putem face in blocuri de cod, o sa vedem mai tarziu
	
	for (int i = 0; i < 10; i++) {
		System.out.println("Nu scriem for in afara metodelor");
	}
}
```
- exemplul 2
```java
int a = 69; // nu declaram variabile in afara claselor - in C++ se poate
System.out.println("Nu scriem println in afara claselor");
for (int i = 0; i < 10; i++) {
	System.out.println("Nu scriem for in afara claselor");
}
public class SomeClass {
}
```
- exemplul 3
```java
void doStuff() {
	System.out.println("Nu scriem metode in afara claselor");
}

public class SomeClass {

}
```

Așa da:
```java
public class MyClass {
	int a = 69; // a este un membru al clasei MyClass, putem face direct initializarea aici
	
	void doStuff() {
		System.out.println("folosim println in metoda");
		a++;
		for (int i = 0; i < 10; i++) {
			a += 2;
			System.out.println("punem for in metoda " + a);
		}
	}
}
```

## Semnătura main-ului
În Java, funcția main are următoarea semnătură: `public static void main(String[] args)`, care este echivalent cu `int main (int argc, char** args)`. În Java, funcția main nu returnează nimic (este `void`) și este o funcție / metodă statică (o să vedem despre static în următoarele laboratoare). Este important să păstrăm această semnătură pentru ca să fie recunoscut entry point-ul programului.
## Instanțierea obiectelor și popularea membrilor unui obiect
Când vrem să folosim un obiect, mai întâi il instanțiem (adică îl creăm cu ajutorul keyword-ului `new` - echivalent cu `malloc` din C)
## Folosirea array-urilor (mai ales cele de obiecte)
## Folosirea keyword-ului `private`
## Coding style - nu sunt greșeli, doar indicații de a scrie cod modularizat și ușor de citit
- numele claselor - e indicat să înceapă cu literă mare
- o clasă ar trebui să aibă fișierul ei, în sensul că trebuie să existe o clasă (cu keyword-ul public
