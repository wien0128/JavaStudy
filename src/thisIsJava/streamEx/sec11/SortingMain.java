package thisIsJava.streamEx.sec11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("hong", 42));
        list.add(new Student("shin", 64));
        list.add(new Student("minn", 97));

        // score 를 기준으로 오름차순 스트림 정렬
        list.stream()
                .sorted()
                .forEach(o -> System.out.println(o.getName() + " " + o.getScore()));
        System.out.println();

        // score 를 기준으로 내림차순 스트림 정렬
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(o -> System.out.println(o.getName() + " " + o.getScore()));
    }
}
