package collection.hashSet;

public class MyHashSetMain2 {
    public static void main(String[] args) {
        MyHashSet2 set = new MyHashSet2();
        Member hi = new Member("hi");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);

        Member search = new Member("JPA");
        boolean res = set.contains(search);
        System.out.println("set.contains(" + search + ") = " + res);
    }
}
