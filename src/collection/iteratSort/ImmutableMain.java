package collection.iteratSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        // 불변 리스트
        List<Integer> list = List.of(1, 2, 3);
        System.out.println("list: " + list.getClass());

        // 불변 -> 가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList: " + mutableList);
        System.out.println("mutableList class: " + mutableList.getClass());
        
        // 가변 -> 불변 리스트
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList class: " + unmodifiableList.getClass());

        // 고정된 크기, 요소 변경 가능 리스트
        List<Integer> aslist = Arrays.asList(1, 2, 3);
        System.out.println("aslist: " + aslist);
    }
}
