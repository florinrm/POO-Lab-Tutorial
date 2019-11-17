package lab8demo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vector<Song> muzicaDeBauta = new Vector<>();
        muzicaDeBauta.add(new Song("Popa si politia", "Nicolae Guta"));
        muzicaDeBauta.add(new Song("Dragoste de inchiriat", "Akcent"));
        muzicaDeBauta.add(new Song("Bag un blunt", "Ian + Azteca"));
        muzicaDeBauta.add(new Song("Leila", "UFO, ZENK, EXPLOIT, LIL NIB, TRIPP, ERIK OG"));

        for (var song: muzicaDeBauta) {
            System.out.println(song);
        }

        Collections.sort(muzicaDeBauta);
        System.out.println("\nSorted with Comparable");

        for (var song: muzicaDeBauta) {
            System.out.println(song);
        }

        Collections.sort(muzicaDeBauta, new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                if (o1.getArtist().equals(o2.getArtist())) {
                    return (-1) * o1.getTitle().compareTo(o2.getTitle());
                }
                return (-1) * o1.getArtist().compareTo(o2.getArtist());
            }
        });

        System.out.println("\nSorted with Comparator");

        for (var song: muzicaDeBauta) {
            System.out.println(song);
        }

        LinkedHashSet<Song> manele = new LinkedHashSet<>();
        manele.add(new Song("Numele tau de azi il voi uita", "Adi Minune"));
        manele.add(new Song("Buzunarul meu vorbeste", "Florin Salam"));
        manele.add(new Song("Sa iubesti doua femei", "Vali Vijelie"));
        manele.add(new Song("Nu dau inapoi", "Dani Mocanu"));
        manele.add(new Song("Buna dimineata", "Liviu Guta"));

        System.out.println("\nUsing an iterator in HashSet");
        Iterator<Song> iterator = manele.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<Song> sortedManele = new TreeSet<Song>(manele);
        System.out.println("\nTreeSet");
        for (var manea: sortedManele) {
            System.out.println(manea);
        }

        sortedManele = new TreeSet<Song>(new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                if (o1.getArtist().equals(o2.getArtist())) {
                    return (-1) * o1.getTitle().compareTo(o2.getTitle());
                }
                return (-1) * o1.getArtist().compareTo(o2.getArtist());
            }
        });
        sortedManele.addAll(manele);
        System.out.println("\nTreeSet with Comparator");
        for (var manea: sortedManele) {
            System.out.println(manea);
        }

        List<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(1);
        list.add(12);
        list.add(69);
        list.add(42);
        list.add(34);
        System.out.println("\n" + list);

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1) - Math.abs(o2);
            }
        });
        pq.add(4);
        pq.add(-3);
        pq.add(5);
        pq.add(-14);
        System.out.println(pq);

        /*
        lectura suplimentara despre tabelele de dispersie din Java:
        https://stackoverflow.com/questions/2889777/difference-between-hashmap-linkedhashmap-and-treemap
        Poate fi o intrebare buna de interviu (Bloomberg)
         */

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        for (var element: list) {
            if (hashMap.containsKey(element)) {
                hashMap.put(element, hashMap.get(element) + 1);
            } else {
                hashMap.put(element, 1);
            }

            if (treeMap.containsKey(element)) {
                treeMap.put(element, treeMap.get(element) + 1);
            } else {
                treeMap.put(element, 1);
            }

            if (linkedHashMap.containsKey(element)) {
                linkedHashMap.put(element, linkedHashMap.get(element) + 1);
            } else {
                linkedHashMap.put(element, 1);
            }

            if (hashtable.containsKey(element)) {
                hashtable.put(element, hashtable.get(element) + 1);
            } else {
                hashtable.put(element, 1);
            }
        }

        System.out.println("\nHashMap");
        for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nTreeMap");
        for (Map.Entry<Integer, Integer> entry: treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nLinkedHashMap");
        for (Map.Entry<Integer, Integer> entry: linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nHashtable");
        for (Map.Entry<Integer, Integer> entry: hashtable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
