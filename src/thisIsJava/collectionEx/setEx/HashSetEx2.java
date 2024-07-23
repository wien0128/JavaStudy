package thisIsJava.collectionEx.setEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("hong", 30));
        set.add(new Member("hong", 30));    // 동등 객체 중복 저장 X

        System.out.println("Set Size: " + set.size());
    }
}
