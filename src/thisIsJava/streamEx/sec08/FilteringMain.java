package thisIsJava.streamEx.sec08;

import java.util.ArrayList;
import java.util.List;

public class FilteringMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hong");
        list.add("Shin");
        list.add("GGam");
        list.add("Shin");
        list.add("Chul");

        // 중복 요소 제거
        list.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        // Shin 으로 시작하는 요소만 필터링
        list.stream()
                .filter(n -> n.startsWith("Shin"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        // 중복 요소 제거 후 Shin 으로 시작하는 요소 필터링
        list.stream()
                .distinct()
                // 주어진 문자열로 시작하면 ture, 아니면 false 반환
                .filter(n -> n.startsWith("Shin"))
                .forEach(System.out::println);
    }
}
