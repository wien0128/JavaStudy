package collection.iteratSort;

import java.util.List;
import java.util.Map;
import java.util.Set;

// .of()를 이용하면 Collection을 편하게 생성 가능
// 단, 불변 컬렉션임.
// 변경 메서드를 호출 시 UnsupportedOperationException 예외 발생

public class OfMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list= " + list);
        System.out.println("set= " + set);
        System.out.println("map= " + map);
        System.out.println("list class= " + list.getClass());
    }
}
