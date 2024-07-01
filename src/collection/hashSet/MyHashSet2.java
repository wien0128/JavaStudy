package collection.hashSet;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSet2 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSet2() {
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; ++i) {
            buckets[i] = new LinkedList<>();
        }
    }
    private int hashIndex(Object o) {
        return Math.abs(o.hashCode()) % capacity;
    }

    public boolean add(Object o) {
        int hashIndex = hashIndex(o);
        LinkedList<Object> bucket = buckets[hashIndex];
        if (bucket.contains(o)) {
            return false;
        }
        bucket.add(o);
        size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(Object o) {
        int hashIndex = hashIndex(o);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(o);
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSet2 { " +
                "buckets= " + Arrays.toString(buckets) + ", size= " + size +
                ", capacity= " + capacity +
                " }";
    }
}
