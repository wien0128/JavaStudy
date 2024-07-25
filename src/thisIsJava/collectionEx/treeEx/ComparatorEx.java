package thisIsJava.collectionEx.treeEx;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
        
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("사과", 10000));
        treeSet.add(new Fruit("수박", 6000));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + " " + fruit.price);
        }
    }
}
