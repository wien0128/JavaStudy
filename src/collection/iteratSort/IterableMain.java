package collection.iteratSort;

import java.util.*;

public class IterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(list.iterator());
        printAll(set.iterator());

        forEach(list);
        forEach(set);
    }

    private static void printAll(Iterator<Integer> iter) {
        System.out.println("Iterator= " + iter.getClass());
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    private static void forEach(Iterable<Integer> iter) {
        System.out.println("Iterable= " + iter.getClass());
        for (Integer i : iter) {
            System.out.println(i);
        }
    }
}
