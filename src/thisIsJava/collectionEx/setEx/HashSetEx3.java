package thisIsJava.collectionEx.setEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx3 {
    public static void main(String[] args) {
        Set<String> set  = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            System.out.println(e);
            if (e.equals("JSP")) {
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
