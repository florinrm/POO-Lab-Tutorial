package lab9demo;

/*
 daca vrem sa restrictionam tipurile de date, facem in felul urmator:
 K sa fie doar Number (adica sa fie subtip de Number aka sa fie doar Integer, Double etc),
 iar V sa fie de tip Comparable
 */
public class RestrictedPair <K extends Number, V extends Comparable> {
    private K key;
    private V value;

    public RestrictedPair (K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
