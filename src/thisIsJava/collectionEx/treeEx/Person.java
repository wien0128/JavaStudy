package thisIsJava.collectionEx.treeEx;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 나이를 기준으로 오름차순
    @Override
    public int compareTo(Person o) {
        if (age < o.age) return -1;
        else if (age == o.age) return 0;
        else return 1;
    }
}
