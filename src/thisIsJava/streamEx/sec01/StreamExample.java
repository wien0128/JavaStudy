package thisIsJava.streamEx.sec01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hong");
        set.add("shin");
        set.add("kim");

        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
