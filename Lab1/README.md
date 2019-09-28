# Introducere în POO și Java
## Ce reprezintă POO?
POO (paradigma orientata pe obiecte) este un mod de gândire în programare, care, in a nutshell, reprezintă programarea folosind clase (exclusiv clase în Java / C#, pe scurt scriem totul în clase, nimic în afara claselor).

## Diferența între C și Java
Până acum ați fost obișnuiți la facultate să scrieți în C în mod procedural.

În Java, toate instrucțiunile trebuie scrise în clase, nu poți să scrii instrucțiuni în afara claselor. Instrucțiunile sunt scrise de regulă în funcții (în Java le spunem metode).

### Clase
Clasa din Java se aseamănă cu `struct` din C, în sensul că ambele sunt folosite pentru a incapsula date. Diferența majoră este faptul că un obiect, care reprezintă instanța unei clase (`MyClass obj = new MyClass();` - obj este instanța unei clase sau mai pe românește spus este un variabilă de tip MyClass), este salvat în memoria heap, în timp ce o variabilă de tip `struct` (în Java nu avem `struct`) este salvată în stack.

## Java I/O
### Clasa Scanner - pentru input
Cu ajutorul clasei Scanner, noi putem citi inputul dat la tastatură.

Exemplu:
```
Scanner scan = new Scanner(System.in);
int no = scan.nextInt(); // se citeste un numar
String str1 = scan.next(); // se citeste un cuvant - pana la urmatorul spatiu
// scan.next() se comporta identic cu scanf("%s", str1) din C

String str2 = scan.nextLine(); // citeste un intreg string, indiferent daca are spatii sau nu
// nextLine() se comporta identic cu fgets din C
```
