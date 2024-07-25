package thisIsJava.collectionEx.treeEx;

import java.util.TreeSet;

public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("홍", 45));
        treeSet.add(new Person("강", 25));
        treeSet.add(new Person("박", 31));

        for (Person person : treeSet) {
            System.out.println(person.name + " " + person.age);
        }
    }
}
