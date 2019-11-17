package lab9demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    // aici putem folosi doar List-uri care contin doar Object, deci nu pot folosi liste care contin Integer, String etc.
    private static void print(List<Object> list) {
        for (Object e: list) {
            System.out.print(e + " ");
        }
        System.out.println("");
    }

    // prin wildcard-uri elimin restrictia de mai sus, putand sa trimit orice tip de lista (cu Integer, String etc)
    private static void printWithWilcard(List<?> list) {
        for (Object e: list) {
            System.out.print(e + " ");
        }
        System.out.println("");
    }

    /**
     * Bounded wildcards:
     * 1) lower bounded
     * 2) upper bounded
     */
    // upper bounded - doar colectii cu elemente ce extind clasa Number in acest caz
    private static void printRestricted (List<? extends Number> list) {
        for (Number e: list) {
            // se putea si Object
            System.out.print(e + " ");
        }
        System.out.println("");
    }

    // lower bounded - doar colectii cu elemente ce sunt superioare lui Number
    private static void printSuperRestricted (List<? super Number> list) {
        for (Object e: list) {
            // aici nu putem cu Number in loc de Object
            System.out.print(e + " ");
        }
        System.out.println("");
    }

    // metode generice
    private static <T> void doStuff1 (T[] obj, List<T> list) {
        for (T lel: obj)
            list.add(lel);
    }

    private static void doStuff2 (Object[] obj, List<?> list) {
        for (Object lel: obj) {
            // eroare de tip incompatible types: Object cannot be converted to CAP#1
            //list.add(lel);
        }
    }

    // ca sa evitam eroarea de mai sus, folosim bounded wildcards
    private static <T> void doStuff3 (List<? extends T> orig, List<T> list) {
        for (T lel: orig)
            list.add(lel);
    }

    private static <T extends Number> void doStuff4 (List<T> orig, List<T> list) {
        for (T lel: orig)
            list.add(lel);
    }

    public static void main (String[] args) {
        /* ASA NU */
        ArrayList vect = new ArrayList(); // neprecizand tipul de date, se va interpreta ca avem by default Object-uri in Vector
        vect.add(69);
        int value = (Integer) vect.get(0); // ca sa luam 69 hihi

        /* ASA DA */
        ArrayList<Integer> vect2 = new ArrayList<Integer>(); // sau new Vector<>(); -> acum stim ca avem int-uri in Vector
        vect2.add(69);
        value = vect2.get(0); // ca sa luam 69 hihi

        Pair<Integer, Integer> pair1 = new Pair<>(69, 69); // aici, K si V sunt inlocuite automat cu tipuri efective (Integer la K si V)
        Pair<Double, String> pair2 = new Pair<>(420.69, "TS e veatza"); // K -> Double, V -> String
        Double pairKey = pair2.getKey(); // nu avem nevoie de cast
        String pairValue = pair2.getValue();

        // Pair<Object, Object> pair3 = pair2; // chiar daca pair3 e mai general, avem eroare de compilare
        // incompatible types: Pair<Double,String> cannot be converted to Pair<Object,Object>
        // adica, chiar daca Double si String mostenesc Object (subclase) =!> <Double, String> subtip al lui <Object, Object>

        // Integer si Double extind clasa Number, String "extinde" (implementeaza) Comparable
        RestrictedPair<Integer, String> p1 = new RestrictedPair<>(69, "SLN");
        RestrictedPair<Double, String> p2 = new RestrictedPair<>(420.0, "SLD");
        System.out.println(p1.getKey());
        System.out.println(p1.getValue());
        System.out.println(p2.getKey());
        System.out.println(p2.getValue());
        // mai jos avem eroare, deoarece String nu extinde Number, iar Pair nu e Comparable
        // RestrictedPair<String, Pair<Integer, Integer>> p3 = new RestrictedPair<>("TDC", new Pair<Integer, Integer>(69, 69));

        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            list.add(rand.nextInt(50));
        }
        // mai jos vom avea eroare, chiar daca Integer extinde Object:  incompatible types: Vector<Integer> cannot be converted to List<Object>
        // print(list);
        printWithWilcard(list);
        printRestricted(list);

        ArrayList<?> vector = new ArrayList<Integer>();
        // vector.add(10); // vom avea eroare, caci nu se stie tipul de date prezent in colectie, desi am instantiat cu Vector<Integer>
        // Solutia
        ((ArrayList<Integer>) vector).add(10); // trebuie cast
        // ((Vector<Long>) vector).add(10); // tzeapa aici, castul trebuie sa fie la fel cu instantierea
        vector.add(null); // fara castare, am putea sa adaugam doar null in colectie

        ArrayList<Number> list2 = new ArrayList<>();
        list2.add(new Integer(69));
        list2.add(new Double(69));
        list2.add(new Long(69));
        printSuperRestricted(list2);
    }
}
