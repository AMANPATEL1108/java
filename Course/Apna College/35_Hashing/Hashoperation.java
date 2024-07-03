import java.util.LinkedList;

public class Hashoperation<K, V> {

    static class Node<K, V> {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size;
    private LinkedList<Node<K, V>>[] bucket;

    @SuppressWarnings("unchecked")
    public Hashoperation() {
        this.size = 0;
        this.bucket = new LinkedList[4];
        for (int i = 0; i < bucket.length; i++) {
            this.bucket[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key) {
        int hc = key.hashCode();
        return Math.abs(hc % bucket.length);
    }

    private int searchInBucket(int bucketIndex, K key) {
        LinkedList<Node<K, V>> ll = bucket[bucketIndex];
        for (int i = 0; i < ll.size(); i++) {
            Node<K, V> node = ll.get(i);
            if (node.key.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public void put(K key, V value) {
        int bucketIndex = hashFunction(key);
        int nodeIndex = searchInBucket(bucketIndex, key);

        if (nodeIndex != -1) {
            Node<K, V> node = bucket[bucketIndex].get(nodeIndex);
            node.value = value;
        } else {
            bucket[bucketIndex].add(new Node<>(key, value));
            size++;
        }
        double loadFactor = (double) size / bucket.length;

        if (loadFactor > 2.0) {
            rehash();
        }
    }

    public boolean containsKey(K key) {
        int bucketIndex = hashFunction(key);
        return searchInBucket(bucketIndex, key) != -1;
    }

    public V remove(K key) {
        int bucketIndex = hashFunction(key);
        int nodeIndex = searchInBucket(bucketIndex, key);

        if (nodeIndex != -1) {
            Node<K, V> node = bucket[bucketIndex].remove(nodeIndex);
            size--;
            return node.value;
        }
        return null;
    }

    public V get(K key) {
        int bucketIndex = hashFunction(key);
        int nodeIndex = searchInBucket(bucketIndex, key);

        if (nodeIndex != -1) {
            Node<K, V> node = bucket[bucketIndex].get(nodeIndex);
            return node.value;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private void rehash() {
        LinkedList<Node<K, V>>[] oldBucket = bucket;
        bucket = new LinkedList[oldBucket.length * 2];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new LinkedList<>();
        }
        size = 0;

        for (LinkedList<Node<K, V>> list : oldBucket) {
            for (Node<K, V> node : list) {
                put(node.key, node.value);
            }
        }
    }

    public static void main(String[] args) {
        Hashoperation<String, Integer> hashMap = new Hashoperation<>();
        hashMap.put("India", 1);
        hashMap.put("China", 2);
        hashMap.put("Usa", 3);

        System.out.println("Value for 'key1': " + hashMap.get("key1")); // Output: 1
        System.out.println("Contains 'key2': " + hashMap.containsKey("key2")); // Output: true
        System.out.println("Removed value for 'key1': " + hashMap.remove("key1")); // Output: 1
        System.out.println("Contains 'key1': " + hashMap.containsKey("key1")); // Output: false
    }
}
