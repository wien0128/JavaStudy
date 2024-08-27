package thisIsJava.streamEx.sec14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectMain2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Hong", "Male", 87));
        list.add(new Student("Shin", "Male", 65));
        list.add(new Student("Ggum", "Female", 18));
        list.add(new Student("Tiem", "Male", 37));
        list.add(new Student("Baem", "Female", 82));

        Map<String, List<Student>> map = list.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getSex())
                );

        List<Student> maleList = map.get("Male");
        maleList.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();

        List<Student> femaleList = map.get("Female");
        femaleList.stream().forEach(s -> System.out.println(s.getName()));
    }
}
