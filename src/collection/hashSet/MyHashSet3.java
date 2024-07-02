package collection.hashSet;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSet3<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSet3() {
        initBuckets();
    }

    public MyHashSet3(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; ++i) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    public boolean add(E e) {
        int hashIndex = hashIndex(e);
        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains(e)) {
            return false;
        }
        bucket.add(e);
        size++;
        return true;
    }

    public boolean contains(E search) {
        int hashIndex = hashIndex(search);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(search);
    }

    public boolean remove(E e) {
        int hashIndex = hashIndex(e);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(e);
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSet3 { " +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                "}";
    }
}
