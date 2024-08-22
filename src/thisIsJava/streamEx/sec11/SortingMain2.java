package thisIsJava.streamEx.sec11;

import java.util.ArrayList;
import java.util.List;

public class SortingMain2 {
    public static void main(String[] args) {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2("John", 19));
        list.add(new Student2("Smith", 73));
        list.add(new Student2("Hong", 35));
        
        // score 기준 오름차순 스트림 정렬
        // Comparator 이용
        list.stream()
                .sorted((o1, o2) -> Integer.compare(o1.getScore(), o2.getScore()))
                .forEach(o -> System.out.println(o.getName() + " " + o.getScore()));
        System.out.println();
        
        // score 기준 내림차순 스트림 정렬
        list.stream()                             // 순서만 바꿈
                .sorted((o1, o2) -> Integer.compare(o2.getScore(), o1.getScore()))
                .forEach(o -> System.out.println(o.getName() + " " + o.getScore()));
    }
}
