package CSW_Sem_4.src.Generics02;
class Pair<K, V> {
    K key;
    V value;

    public Pair(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }

    public void setKey(K k) {
        this.key = k;
    }
    public void setValue(V v) {
        this.value = v;
    }
}

public class q1 {
    public static void main(String[] args) {
        Pair<Integer , String> obj1 = new Pair<>(10 , "Sahoo");
        System.out.print("Key : "+obj1.getKey()+" - Value : "+obj1.getValue());
    }
}
