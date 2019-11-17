package lab9demo;

/* folosim K si V (tipuri formale) pentru a face un cod mai generalizat,
    in sensul ca nu ar mai trebui sa scriu clase separate Pair pentru <Integer, Integer>
    <Integer, String> etc. -> salvez cod si draci
    (cine dracu sta sa scrie cod la fel doar ca difera tipul de date?)
*/
public class Pair <K, V> {
    private K key;
    private V value;

    public Pair (K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey (K key) {
        this.key = key;
    }

    public void setValue (V value) {
        this.value = value;
    }
}