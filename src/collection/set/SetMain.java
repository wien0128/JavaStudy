package collection.set;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        run(new HashSet<String>()); // 입력한 순서 보장 X
        run(new TreeSet<String>()); // 데이터 값 기준 정렬 (레드-블랙 트리)
        run(new LinkedHashSet<String>()); // 입력한 순서 보장 O
    }

    private static void run(Set<String> set) {
        System.out.println("set: " + set.getClass());
        set.add("B");
        set.add("C");
        set.add("A");
        set.add("1");
        set.add("2");

        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
