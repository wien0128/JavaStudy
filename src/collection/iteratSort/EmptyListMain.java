package collection.iteratSort;

import java.util.*;

// 빈 리스트 생성 방법
// 빈 불변 리스트는 최신 기능인 of()를 쓰자

public class EmptyListMain {
    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        
        // 빈 불변 리스트 생성
        // 자바5
        List<Integer> list3 = Collections.emptyList();
        // 자바9
        List<Integer> list4 = List.of();

        System.out.println("list3: " + list3.getClass());
        System.out.println("list4: " + list4.getClass());
    }
}
