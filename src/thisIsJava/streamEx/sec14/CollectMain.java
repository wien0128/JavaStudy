package thisIsJava.streamEx.sec14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Hong", "Male", 87));
        list.add(new Student("Shin", "Male", 65));
        list.add(new Student("Ggum", "Female", 18));
        list.add(new Student("Tiem", "Male", 37));
        list.add(new Student("Baem", "Female", 82));

        List<Student> maleList = list.stream()
                .filter(s -> s.getSex().equals("Male"))
                .toList();

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        Map<String, Integer> map = list.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(),
                                s -> s.getScore()
                        )
                );

        System.out.println(map);
    }
}
