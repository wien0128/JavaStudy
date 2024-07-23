package thisIsJava.collectionEx.setEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");    // 중복 객체 저장 X
        set.add("Spring");

        System.out.println("Set Size: " + set.size());
    }
}
