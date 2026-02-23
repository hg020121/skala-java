package generic.pair;

public class Pair<K, V> { //key는 문자열, value는 숫자열로 해서 하나의 stockPair를 만들어보자

    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
