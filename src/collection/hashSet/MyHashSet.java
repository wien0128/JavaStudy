package collection.hashSet;

import java.util.Arrays;

public class MyHashSet {
    private int[] elementData = new int[10];
    private int size = 0;

    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
        elementData[size++] = value;
        return true;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSet { " +
                "elementData= " + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size= " + size +
                "}";
    }
}
