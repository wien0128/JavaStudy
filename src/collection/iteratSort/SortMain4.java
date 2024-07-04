package collection.iteratSort;

import java.util.TreeSet;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("A", 30);
        MyUser myUser2 = new MyUser("B", 20);
        MyUser myUser3 = new MyUser("C", 10);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new SortMain2.IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);
    }
}
